package com.jon.learning.udemy.hashtable;

public class HandleCollision {
    private int capacity;
    private String[][] keys;
    private String[][] values;

    public HandleCollision(int capacity) {
        this.capacity = capacity;
        this.keys = new String[capacity][capacity];
        this.values = new String[capacity][capacity];
    }

    public boolean put(String key, String value) {
        //get hashed value of the key
        //if hashed as index points to null, put this key and in 0 of this hashed index
        //else, loop through the String[] in the items reference by index hashed and
        //if one of them is equals to the input key, return false else
        //assign the input value to the first empty array slot
        int hashed = hash(key);
        if (!isOccupied(hashed)) {
            this.keys[hashed][0] = key;
            this.values[hashed][0] = value;
            return true;
        } else {
            for (int i = 0; i < this.keys[hashed].length; i++) {
                if (this.keys[hashed][i] != null && this.keys[hashed][i] == key) {
                    return false;
                } else if (this.keys[hashed][i] == null) {
                    this.keys[hashed][i] = key;
                    this.values[hashed][i] = value;
                    return true;
                }
            }
        }

        return false;
    }

    public int hash(String key) {
        return key.hashCode() % capacity;
    }

    public boolean isOccupied(int hashedKey) {
        return keys[hashedKey] != null;
    }
}
