## Database Index

A database index is an additional data structure created on top of the data in a table. We can specify an index over a table and a column or set of columns. This creates an additional data search structure associated with that table and the set of columns. 
  
The purpose of a database index is to improve query performance by speeding up data retrieval. This is done at the cost of additional storage space to hold the B-TREE data structure and the pointers to the actual data.
  
Indexes are used to help the database find data quickly without having to go over every row in a table every time it is queried. Overall, indexes provide a very efficient way of accessing ordered records.
  
Syntax-
```mysql
CREATE INDEX index_name
ON table_name (column_name_1, column_name2, ..)
```
The primary key of a table is the default non-clustered index of the table which defines how the data will be sorted in the 
physical storage or data pages. 

There are different types of indexes, each of which has different internal data structures and is useful for specific scenarios.  

From the point of view of the characteristics of the index attribute:  
- Primary Index
- Clustered Index
- Secondary Index  

From the point of view of the number of index references to a data file:
- Dense Index
- Sparse Index  

Specialized indexes for highly specific scenarios:
- Bitmap Index
- Reverse Index
- Hash Index
- Filtered Index
- Function-based Index
- Spatial Index

## [B-tree :](https://en.wikipedia.org/wiki/B-tree)
A B-tree is a widely used data structure in databases to organize and efficiently manage large datasets.

A B-tree is a data structure that provides sorted data and allows searches, sequential access, attachments and removals in sorted order. The B-tree is highly capable of storing systems that write large blocks of data. The B-tree simplifies the binary search tree by allowing nodes with more than two children.  

When B-tree comes to the database indexing, this data structure gets a little complicated because it doesn’t just have a key, it also has a value associated with the key. This value is a reference to the actual data record. The key and value together are called a payload.  

- When you define an index on a column or set of columns in a database table, the database system creates a B-tree structure to represent that index.
- n the B-tree index, each node contains key-value pairs.The key is the indexed value from the table, and the value is a reference or pointer to the corresponding row in the table.
- The B-tree maintains a sorted order of keys, allowing for efficient search operations.
- When a query involves a condition on the indexed column(s), the B-tree index is used to quickly locate the rows that satisfy the condition. The search operation starts at the root and traverses the tree to find the desired key or range of keys.
- B-trees automatically balance themselves during insertions and deletions to maintain their logarithmic height. This ensures that search, insertion, and deletion operations remain efficient.
- B-trees are designed to minimize disk I/O operations by ensuring that the tree remains balanced. This is crucial for performance, especially in disk-based storage systems.
- Depending on the database system, B-trees can be used for both clustered and non-clustered indexes. A clustered index determines the physical order of rows in the table, while a non-clustered index maintains a separate sorted structure.

### B+ tree : 
B+ trees are commonly used in database indexing due to several advantages that make them well-suited for efficient storage and retrieval of data.  

B+ trees maintain a balanced structure, ensuring that all leaf nodes are at the same level. This balance helps maintain optimal search, insert, and delete operations, resulting in consistent performance.

B+ tree is another data structure that’s used to store data and looks almost the same as the B-tree. The only difference is that B+ tree stores data on the leaf nodes. This means that all non-leaf node values are duplicated in leaf nodes again.  

Leaf nodes include all values and all the records are in sorted order. B+tree allows you to do the same search as B-tree, but it also allows you to  travel through all the values in a leaf node if we put a pointer to each leaf node.  

![Screenshot (56)](https://github.com/learning-project-01/bookstore-app/assets/130679461/24d83871-d6a6-41a6-ac47-2fde468f8bb3)


## Example : Use case of Index

Let's consider the below table with columns and data items.
```mysql
CREATE TABLE catalog_item (
  id bigint NOT NULL,
  name varchar(255) DEFAULT NULL,
  price float DEFAULT NULL,
  PRIMARY KEY (`id`)
) 
```
For understanding here lets take table with 3 columns and have 10000 rows of records.

Let's count the approximate size of each row = 8 byte (id) + 256 byte (name) + 4 byte (price) = 268 byte / record  

Total size of the table ~= 268 * 10000 = 26,80,000 byte 

The default InnoDB page size is 16384 (16KB)

The total number of physical memory blocks required to store the table = 26,80,000/16384 ~= **163** different blocks

If we take 1 second to read each block then to read the whole table it will take roughly around 163 without any specified index.

```mysql
SELECT * FROM catalog_item WHERE price = 1000;
```
This above query will take 163 seconds which is time to take the read the whole table from memory.

To enhance this we use index lets create an Index on price column.
```mysql
CREATE INDEX IX_un_price ON catalog_item(price);
```
The index will create another reference table with price sorted with the unique key value.

Each row on the reference table will have price field and id field only so,  
Size of each row  4 byte (price column) + 8 byte (id) = 12;
Total size of table = 10000* 12 = 1,20,000   
No. of memory blocks required = 120000/16384 ~= 7 blocks   
To read the data from the storage = 7 seconds

**_Time taken to execute query before Index ~= 163  
Time taken to execute query after Index ~= 7_**

Indexing reduces the query time and significantly increasing the performance of the database.



