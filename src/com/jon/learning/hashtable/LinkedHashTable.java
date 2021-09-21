package com.jon.learning.hashtable;

import com.jon.learning.model.Employee;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedHashTable {
    private LinkedList<StoredEmployee>[] hashtable;

    public LinkedHashTable(){
        hashtable = new LinkedList[10];
        for (int i=0; i < hashtable.length; i++) {
            hashtable[i] = new LinkedList<>();
        }
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        hashtable[hashedKey].add(new StoredEmployee(key, employee));
    }

    public Employee get(String key) {
        int hashedKey = hashKey(key);
        Iterator<StoredEmployee> iter = hashtable[hashedKey].iterator();
        StoredEmployee sEmp = null;
        while (iter.hasNext()) {
            sEmp = iter.next();
            if (sEmp.key.equals(key)) return sEmp.getEmployee();
        }

        return null;
    }

    public Employee remove(String key) {
        int hashedKey = hashKey(key);
        LinkedList<StoredEmployee> storedEmployees = hashtable[hashedKey];
        if (storedEmployees == null) return null;

        int index = -1;
        for (int i = 0; i < storedEmployees.size(); i++) {
            if (storedEmployees.get(i).key.equals(key)) {
                index = i;
                break;
            }
        }

        if (index > -1) {
            return storedEmployees.remove(index).getEmployee();
        }
        return null;
    }

    public void printHashTable() {
        for (int i=0; i < hashtable.length; i++) {
            if (hashtable[i].isEmpty()) {
                System.out.println("Position "+i+": empty");
            } else {
                System.out.print("Position "+i+": ");
                Iterator<StoredEmployee> iter = hashtable[i].iterator();
                while (iter.hasNext()) {
                    System.out.print(iter.next());
                    System.out.print(" -> ");
                }
                System.out.println("null");
            }
        }
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }
}
