package com.jon.learning.udemy.hashtable;

import java.util.Objects;

public class BasicHashTable {
    private int capacity;
    private int size;
    private final String[] keys;
    private final String[] values;
    //constructor that accepts size
    public BasicHashTable(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.keys = new String[capacity];
        this.values = new String[capacity];
    }

    //put - put a key-value pair into the hashtable
    public void put(String key, String value) {
        int hashed = hash(key);
        keys[hashed] = key;
        values[hashed] = value;
        size++;
    }
    //get - get a value for a given key
    public String get(String key) {
        return values[hash(key)];
    }
    //keys - return the array of keys
    public String[] getKeys() {
        int i = 0;
        String[] existingKeys = new String[size];
        for (String key : this.keys) {
            if (Objects.nonNull(key)) existingKeys[i++] = key;
        }
        return existingKeys;
    }

    public int size() {
        return this.size;
    }

    private int hash(String key) {
        return key.hashCode() % capacity;
    }
}
