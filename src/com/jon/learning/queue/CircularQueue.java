package com.jon.learning.queue;

import com.jon.learning.model.Employee;

public class CircularQueue {
    private int front;
    private int back;
    private Employee[] employees;

    public static void main(String[] args) {
        int id = 1;
        CircularQueue queue = new CircularQueue(2);
        queue.add(new Employee("Jon", "Chiu", id++));
        queue.add(new Employee("Joan", "Chiu", id++));
        queue.add(new Employee("Faith Raine", "Chiu", id++));
        queue.remove();
        queue.add(new Employee("Yuan", "Chiu", id++));
        queue.printQueue();
        queue.add(new Employee("Azsy Bien", "Chiu", id++));
        queue.printQueue();
        queue.remove();
        queue.remove();
        queue.add(new Employee("Bugger", "Booger", id++));
        queue.printQueue();
    }

    public CircularQueue(int capacity) {
        employees = new Employee[capacity];
    }

    public void add(Employee employee) {
        if (size() == employees.length - 1) {
//            int elemSize = size();
            Employee[] emps = new Employee[employees.length * 2];
            System.arraycopy(employees, front, emps, 0, employees.length - front);
            System.arraycopy(employees, 0, emps, employees.length - front, back);
//            back = elemSize;
            back = size();
            front = 0;
            employees = emps;
        }

        employees[back++] = employee;
        if (back >= employees.length) back = 0;
    }

    public Employee remove() {
        if (isEmpty()) return null;

        //0 azsy -front
        //1 -back
        //2
        //3
        Employee emp = employees[front];
        employees[front] = null;
        front++;
        if (isEmpty()) {
            front = 0;
            back = 0;
        } else if (front == employees.length) {
            front = 0;
        }

        return emp;
    }

    public int size() {
        if (back >= front) {
            return back - front;
        } else {
            return back - front + employees.length;
        }
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public void printQueue() {
        System.out.println("Contents\n--------");
        int i;
        if (front > back) {
            for (i=front; i<employees.length; i++) {
                System.out.print(employees[i]+" -> ");
            }
        }
        for (i=0; i < back; i++) {
            System.out.print(employees[i]+" -> ");
        }
        System.out.println("null");
    }
}
