package com.djabapractice;

import jdk.jshell.spi.ExecutionControl;

import java.util.HashMap;
import java.util.Map;

/**
 * The LRUCache class implements a Least Recently Used (LRU) cache.
 * It uses a combination of a HashMap for fast lookup and a doubly linked list
 * for managing the ordering of nodes based on their usage. The cache evicts the least recently used
 * key-value pair when it exceeds its capacity.
 */
public class LRUCache {

    /**
     * Constructs an LRUCache with the specified capacity.
     *
     * @param capacity the maximum number of entries the cache can hold before evicting the least recently used one.
     * @throws IllegalArgumentException when capacity less or equal zero
     */
    public LRUCache(int capacity) {
        throw new RuntimeException("Not Implemented");
    }

    /**
     * Retrieves the value associated with the specified key in the cache.
     * If the key exists, it moves the corresponding node to the front of the list,
     * marking it as the most recently used.
     *
     * @param key the key whose associated value is to be returned.
     * @return the value associated with the key if it exists, otherwise -1.
     */
    public int get(int key) {
        throw new RuntimeException("Not Implemented");
    }

    /**
     * Inserts a key-value pair into the cache. If the key already exists, it updates the value
     * and marks the key as recently used. If the cache is full, it evicts the least recently used
     * entry before inserting the new one.
     *
     * @param key the key to insert or update.
     * @param value the value associated with the key.
     */
    public void put(int key, int value) {
        throw new RuntimeException("Not Implemented");
    }
}
