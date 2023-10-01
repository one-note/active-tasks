## Internal working of a Hashmap

### What is a HashMap  

- HashMap uses its static inner class Node<K,V> for storing the entries in the map.
- HashMap allows at most one null key and multiple null values.
- The HashMap class does not preserve the order of insertion of entries into the map.
- HashMap has multiple buckets or bins which contain a head reference to a singly linked list. That means there would be as many linked lists as there are buckets. Initially, it has a bucket size of 16 which grows to 32 when the number of entries on the map crosses the 75%. (That means after inserting in 12 buckets bucket size becomes 32)
- HashMap is almost similar to Hashtable except that it’s unsynchronized and allows at max one null key and multiple null values.
- HashMap uses hashCode() and equals() methods on keys for the get and put operations. So HashMap key objects should provide a good implementation of these methods.

### How the values are stored internally.

![internalWorking](https://github.com/Ansu-s/need_to_study_this/assets/130679461/186efc3b-8e89-479d-9144-26de6ede6b04)

```
hash(key)->value%16(any num)->index of bucket -> bucket [index,key,value,next pointer]
```
- Hashing: When you put a key-value pair into a HashMap, the HashMap uses the key's hash code (calculated using the hashCode() method) to determine where to store the value internally. Hashing is the process of converting the key's hash code into an index within the underlying array. This index is often referred to as the "bucket."

- Bucket Array: Internally, a HashMap uses an array of buckets (also called nodes or bins) to store key-value pairs. Each bucket can store multiple key-value pairs. The number of buckets is determined by the initial capacity you specify when creating the HashMap.

- Index Calculation: To determine the bucket (index) where a key-value pair should be stored, the hash code of the key is passed through a hashing function. This function typically involves taking the modulo of the hash code with the current capacity of the HashMap to ensure it falls within the valid range of indices.

- Collision Handling: It's possible for different keys to produce the same hash code, leading to a collision. To handle collisions, each bucket in the HashMap can actually be a linked list (in older versions of Java) or a balanced tree (in Java 8 and later). When a collision occurs, the new key-value pair is added to the appropriate bucket. If a bucket already contains entries, the HashMap compares keys using the equals() method to ensure uniqueness within that bucket.

- Load Factor: HashMaps keep track of the number of entries (key-value pairs) they contain. When the number of entries exceeds a certain threshold, determined by the load factor (usually 0.75 by default), the HashMap automatically resizes itself by doubling the number of buckets and rehashing all the key-value pairs. This ensures that the HashMap remains efficient and avoids collisions.

- Retrieval: When you want to retrieve a value associated with a key, the HashMap uses the same hashing and indexing process to locate the bucket where that key would be stored. It then searches within that bucket (linked list or tree) based on key equality to find the correct value. Retrieval is typically a fast O(1) operation on average but can degrade to O(n) in rare cases with many collisions.

- Null Handling: HashMaps allow one null key and multiple null values. Null keys are stored in a specific bucket, and null values can be associated with any key.

- Iterating Through Entries: You can iterate through all the entries in a HashMap using iterators or enhanced for loops. The order of iteration may not be predictable in a regular HashMap, but it is predictable in a LinkedHashMap.

When we have more than one entry for a specific index bucket then single linked list is formed pointing from that index.
we assume that all these five keys have the same hashCode, then the bucket number or index returned by the hash function would be the same for these five keys (in this case bucket 4) and hence they are put into the same bucket.  

![single linkedlist](https://github.com/Ansu-s/need_to_study_this/assets/130679461/aedf0ef5-7598-4c67-9858-314e0822427a)
The threshold value for a linkedlist is set to 8 if it's size increases from it then the given problems arises.
Before java 8, singly-linked lists were used for storing the nodes. But this implementation has changed to self-balancing BST after a thresold is crossed (static final int TREEIFY_THRESHOLD = 8;). The motive behind this change is that HashMap buckets normally use linked lists, but for the linked lists the worst-case time is O(n) for lookup. Also note that Ordinary binary search trees have pathological cases where they become O(n) [basically BST becomes skewed], but red-black/AVL trees are specifically designed to prevent these cases. In a HashMap with linked lists, if we have a really really awful hash function, we could end up with all the items hashing to the same bucket and get O(n) lookup, But it seems like with this red-black/AVL tree scheme, even if all the items hashed into the same bucket, we would get O(log⁡n) lookup in worst of worst scenario.  

![selfBalancig tree](https://github.com/Ansu-s/need_to_study_this/assets/130679461/a83abc3b-c083-4855-a4b0-321faa759cd4)

### Time Complexity of HashMap

The time complexity of a HashMap in various cases depends on the specific operation being performed. Here are the time complexities for common HashMap operations:

- Insertion (put): The average-case time complexity for inserting a key-value pair into a HashMap is O(1). However, in rare cases where there are hash collisions (different keys map to the same bucket), the worst-case time complexity can be O(n), where n is the number of elements in the bucket. To maintain good performance, HashMaps automatically resize themselves when the load factor is exceeded, which helps mitigate collisions.

- Retrieval (get): The average-case time complexity for retrieving a value associated with a key from a HashMap is O(1), as it involves a direct lookup based on the key's hash code. In the worst case (again, due to collisions), retrieval can degrade to O(n), where n is the number of elements in the bucket.

- Deletion (remove): Similar to retrieval, the average-case time complexity for removing a key-value pair from a HashMap is O(1). In the worst case (collisions), it can be O(n) due to having to search within a bucket.

- Search (containsKey): Checking whether a HashMap contains a specific key has an average-case time complexity of O(1). In the worst case, it can be O(n) due to hash collisions.

It's important to note that these time complexities assume a good hash function and proper resizing (rehashing) of the HashMap as it grows to maintain a low load factor. When the load factor exceeds a certain threshold (typically 0.75), the HashMap will automatically resize itself, ensuring that the number of buckets is increased to maintain efficiency and minimize collisions.
