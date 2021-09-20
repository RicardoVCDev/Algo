package com.jon.learning.hashtable;

import com.jon.learning.model.Employee;

public class SimpleHashTable {
    public StoredEmployee[] hashtable;

    public SimpleHashTable() {
        this.hashtable = new StoredEmployee[10];
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        if (isOccupied(hashedKey)) {
            int stopIndex = hashedKey;
            if (hashedKey == hashtable.length - 1) {
                hashedKey = 0;
            } else {
                hashedKey++;
            }
            while (isOccupied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = ++hashedKey % hashtable.length;
            }
        }

        if (isOccupied(hashedKey)) {
            System.out.println("Sorry, there is already an employee at position " + hashedKey);
        } else {
            hashtable[hashedKey] = new StoredEmployee(key, employee);
        }
    }

    public Employee get(String key) {
        int find = findKey(key);
        if (find < 0) {
            return null;
        } else {
            return hashtable[findKey(key)].getEmployee();
        }
//        StoredEmployee emp = hashtable[hashedKey];
//        for (int i=hashedKey + 1;
//             emp != null && !emp.getKey().equals(key) && i < hashtable.length;
//             i++) {
//
//            emp = hashtable[i];
//        }
//        if (emp == null) {
//            System.out.println("Employee "+key+" not found.");
//            return null;
//        } else {
//            return emp.getEmployee();
//        }
    }

    public Employee remove(String key) {
        int find = findKey(key);
        if (hashtable[find] == null) return null;
        StoredEmployee sEmp = hashtable[find];
        hashtable[find] = null;
        return sEmp.getEmployee();
    }

    public void printHashTable() {
        for (int i=0; i < hashtable.length; i++) {
            System.out.println(hashtable[i]);
        }
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    private boolean isOccupied(int hashedKey) {
        return hashtable[hashedKey] != null;
    }

    private int findKey(String key) {
        int hashedKey = hashKey(key);
//        if (hashtable[hashedKey] == null) return -1;
//        coz null could mean the employee might still be further down the array
        if (hashtable[hashedKey] != null &&
                hashtable[hashedKey].key.equals(key)) {
            return hashedKey;
        }
        int stopIndex = hashedKey;
        if (hashedKey == hashtable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }
        while (hashedKey != stopIndex &&
                hashtable[hashedKey] != null &&
                !hashtable[hashedKey].key.equals(key)) {
            hashedKey = ++hashedKey % hashtable.length;
        }
        if (hashtable[hashedKey] != null &&
                hashtable[hashedKey].key.equals(key)) {
            return hashedKey;
        } else {
            return -1;
        }
    }
}
