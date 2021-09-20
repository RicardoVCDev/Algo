package com.jon.learning.hashtable;

import com.jon.learning.model.Employee;

public class MainHashTable {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 456);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        SimpleHashTable ht = new SimpleHashTable();
        ht.put(janeJones.getLastName(), janeJones);
        ht.put(johnDoe.getLastName(), johnDoe);
        ht.put(mikeWilson.getLastName(), mikeWilson);
        ht.put(marySmith.getLastName(), marySmith);

        ht.printHashTable();

        System.out.println("Find Wilson: "+ ht.get("Wilson"));
        System.out.println("Find Smith: " + ht.get("Smith"));
        System.out.println("Find Jones: " + ht.get("Jones"));
        System.out.println("Find Chiu: " + ht.get("Chiu"));
        System.out.println("Remove Jones: "+
                (ht.remove("Jones") != null
                ? "sucessful"
                : "not found"));
        System.out.println("Find Smith: " + ht.get("Smith"));
        System.out.println("Find Jones: " + ht.get("Jones"));
        System.out.println("Find Wilson: "+ ht.get("Wilson"));
        System.out.println("Remove Wilson: "+
                (ht.remove("Wilson") != null
                        ? "sucessful"
                        : "not found"));
        System.out.println("Find Smith: " + ht.get("Smith"));
//        System.out.println("Find Jones: " + ht.get("Jones"));
    }
}
