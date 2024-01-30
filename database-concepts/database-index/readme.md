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



