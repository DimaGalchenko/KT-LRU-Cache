# LRUCache Implementation

This project implements a **Least Recently Used (LRU) Cache** using Java. The cache supports two primary operations:

* `get(key)`: Returns the value associated with the specified key if it exists in the cache. Marks the key as recently used.

* `put(key, value)`: Inserts a key-value pair into the cache. If the cache exceeds its capacity, it evicts the least recently used (LRU) entry. If the key already exists, its value is updated, and it is marked as recently used.
The cache uses a combination of a HashMap for constant-time key lookups and a Doubly Linked List to maintain the order of usage for the cache entries.

NOTE **(must be implemented)**: 
* **Time Complexity:** `O(1)` for both get() and put() operations.
* **Eviction Policy:** When the cache reaches its capacity, the least recently used (LRU) item is evicted.

<img width="558" alt="Screenshot 2024-09-24 at 07 07 23" src="https://github.com/user-attachments/assets/388c30a4-3200-48c9-92f5-db7d63ea24df">
