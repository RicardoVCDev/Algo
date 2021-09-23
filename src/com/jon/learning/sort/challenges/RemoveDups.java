package com.jon.learning.sort.challenges;

import java.time.Instant;
import java.util.*;

public class RemoveDups {

    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Jane", "Jones", 123));

        employees.forEach(e -> System.out.println(e));

        List<Integer> removed = new ArrayList<>();
        Map<Integer, Employee> emps = new HashMap<>();

        for (int i=0; i < employees.size(); i++) {
            if (emps.get(employees.get(i).getId()) == null) {
                emps.put(employees.get(i).getId(), employees.get(i));
            } else {
                removed.add(i);
            }
        }

        for (Integer i : removed) {
            employees.remove(i);
        }

        System.out.println("----> removed dups...");
        emps.values().forEach(v -> System.out.println(v));
//        int[] nums = new int[10];
//        int[] numsToAdd = { 59382, 43, 6894, 500, 99, -58 };
//        for (int i = 0; i < numsToAdd.length; i++) {
//            nums[hash(numsToAdd[i])] = numsToAdd[i];
//        }
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
    }

    public static int hash(int value) {
        return Math.abs(value % 10);
    }
}
