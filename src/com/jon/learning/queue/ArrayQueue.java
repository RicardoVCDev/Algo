package com.jon.learning.queue;

import com.jon.learning.model.Employee;

import java.util.NoSuchElementException;

public class ArrayQueue {

    private Employee[] employees;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        employees = new Employee[capacity];
    }

    public void add(Employee employee) {
        if (size() == employees.length - 1) {
            int elemsCount = size();
            Employee[] emps = new Employee[employees.length * 2];
            System.arraycopy(employees, front, emps, 0, employees.length - front);
            System.arraycopy(employees, 0, emps, employees.length - front, back);

            employees = emps;
            front = 0;
            back = elemsCount;
        }
        employees[back] = employee;
        if (back < employees.length - 1) {
            back++;
        } else {
            back = 0;
        }
        System.out.println(employee + " added");
    }

    public int size() {
        if (front <= back) {
            return back - front;
        } else{
            return back - front + employees.length;
        }
    }

    public Employee peek() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        return employees[front];
    }

    public Employee remove() {
        Employee emp = peek();
        employees[front] = null;
        front++;
        if (size() == 0) {
            front = 0;
            back = 0;
        } else if (front >= employees.length) {
            front = front - employees.length;
        }
        System.out.println(emp + " removed");
        return emp;
    }

    public void printQueue() {
        System.out.println("---------\nContents:");
        if (front <= back) {
            for (int i=front; i < back; i++) {
                printEmployee(employees[i]);
            }
        } else {
            int i = front;
            for (; i < employees.length; i++) {
                printEmployee(employees[i]);
            }
            for (i=0; i < back; i++) {
                printEmployee(employees[i]);
            }
        }
        System.out.println("---------");
    }

    public static void main(String[] args) {
        int id = 1;
        ArrayQueue queue = new ArrayQueue(3);
        queue.add(new Employee("Jon", "Chiu", id++));
        queue.add(new Employee("Joan", "Chiu", id++));
        queue.printQueue();
        queue.remove();
        queue.add(new Employee("Faith Raine", "Chiu", id++));
        queue.printQueue();
        queue.remove();
        queue.add(new Employee("Yuan", "Chiu", id++));
        queue.printQueue();
        queue.remove();
        queue.add(new Employee("Azsy Bien", "Chiu", id++));
        queue.printQueue();
        queue.remove();
        queue.remove();
        queue.add(new Employee("Bugger", "Booger", id++));
        queue.printQueue();
    }

    public static void printEmployee(Employee emp) {
        System.out.println(emp);
    }
}
