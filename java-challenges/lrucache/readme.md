# LRU Cache

An LRU (Least Recently Used) cache is a type of data structure that maintains a limited number of items and evicts the least recently used item when the maximum capacity is reached. It is commonly used to improve the efficiency of systems by caching frequently accessed or recently used data.

## Why LRU Cache?

In many applications, certain pieces of data are accessed more frequently than others. An LRU cache is designed to store and manage such data efficiently. By keeping track of the order in which items are accessed, the cache can quickly identify and remove the least recently used items when the cache reaches its maximum capacity. This helps in optimizing the utilization of memory and improving overall system performance.

## When to Use LRU Cache?

We should use an LRU cache when:

1. **Frequent Access Patterns:** Our application exhibits frequent access patterns where certain data is accessed more often than others.

2. **Limited Memory Resources:** The system has limited memory resources, and caching can help reduce the load on the underlying data store by keeping frequently used data in memory.

3. **Improved Performance:** Caching can significantly improve performance by reducing the time required to fetch data from slower data sources, such as databases or external services.

4. **Optimizing Resource Usage:** You want to optimize the usage of resources by keeping only the most relevant data in memory.

5. **Improve System Performance:** Utilize the LRU cache to improve the performance of your application by keeping frequ