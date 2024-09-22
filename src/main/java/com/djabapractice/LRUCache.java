package com.djabapractice;

import java.util.Map;

/**
 * The LRUCache class implements a Least Recently Used (LRU) cache.
 * It uses a combination of a HashMap for fast lookup and a doubly linked list
 * for managing the ordering of nodes based on their usage. The cache evicts the least recently used
 * key-value pair when it exceeds its capacity.
 */
public class LRUCache {
    // HashMap to store key and corresponding Node reference for quick access.
    private final Map<Integer, Node> cacheMap;
    // Doubly linked list to store cache entries in order of usage, with the most recently used at the front.
    private final DoublyLinkedList cacheList;
    // The maximum number of entries the cache can hold.
    private final int capacity;

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

    }

    /**
     * Node class represents a key-value pair in the cache.
     * Each node has a reference to the previous and next node, allowing it to be part of a doubly linked list.
     */
    private static class Node {
        private int key;
        private int value;
        private Node prev, next;

        /**
         * Constructs a new Node with the given key and value.
         *
         * @param key the key associated with the node.
         * @param value the value associated with the node.
         */
        public Node(int key, int value) {

        }
    }

    /**
     * DoublyLinkedList class is used to store the nodes in the order of their usage.
     * The head of the list represents the most recently used (MRU) node, and the tail
     * represents the least recently used (LRU) node.
     */
    private static class DoublyLinkedList {
        private Node head; // should be final
        private Node tail; // should be final

        /**
         * Constructs a DoublyLinkedList with dummy head and tail nodes.
         * The head and tail nodes are placeholders to simplify insertion and removal operations.
         */
        public DoublyLinkedList() {

        }

        /**
         * Adds a node to the front of the list, marking it as the most recently used.
         *
         * @param node the node to add to the front of the list.
         */
        public void addToFront(Node node) {

        }

        /**
         * Removes a node from the list by adjusting the pointers of its neighboring nodes.
         *
         * @param node the node to remove from the list.
         */
        public void removeNode(Node node) {

        }

        /**
         * Moves an existing node to the front of the list, marking it as the most recently used.
         *
         * @param node the node to move to the front.
         */
        public void moveToFront(Node node) {

        }

        /**
         * Removes and returns the least recently used (LRU) node, which is the node right before the tail.
         *
         * @return the least recently used node.
         */
        public Node removeLast() {
            return null;
        }
    }
}
