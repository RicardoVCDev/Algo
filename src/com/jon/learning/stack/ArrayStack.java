package com.jon.learning.stack;

import com.jon.learning.model.Employee;

public class ArrayStack {
    private int size;
    private Employee[] employees;

    public ArrayStack() {
        employees = new Employee[16];
    }

    public ArrayStack(int capacity) {
        employees = new Employee[capacity];
    }

    public void push(Employee employee) {
        if (size() == employees.length - 1){
            Employee[] emps = new Employee[employees.length * 2];
            System.arraycopy(employees, 0, emps, 0, employees.length);
            employees = emps;
        }

        employees[size++] = employee;
    }

    public Employee pop() {
        if (size() == 0) return null;

        Employee emp = employees[--size];
        employees[size] = null;
        return emp;
    }

    public Employee peek() {
        if (size() == 0) return null;
        return employees[size - 1];
    }

    public int size() {
        return size;
    }

    public void printStack() {
        System.out.print("TOP -> ");
        for (int i=size-1; i >= 0; i--) {
            System.out.print(employees[i]+" -> ");
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(2);
        stack.printStack();

        int id = 1;
        Employee jon = new Employee("Jon", "Chiu", id++);
        Employee joan = new Employee("Joan", "Chiu", id++);
        Employee faith = new Employee("Faith Raine", "Chiu", id++);
        Employee yuan = new Employee("Yuan", "Chiu", id++);
        Employee azsy = new Employee("Azsy Bien", "Chiu", id++);
        Employee jan = new Employee("Jan", "Uary", id++);
        Employee someone = new Employee("One", "Some", id++);

        stack.push(jon);
        stack.push(joan);
        stack.printStack();

        stack.push(faith);
        stack.printStack();

        System.out.println("Popped "+stack.pop());
        stack.printStack();

        stack.push(yuan);
        stack.printStack();

        stack.push(azsy);
        stack.printStack();
        System.out.println("Peek: "+stack.peek());
        System.out.println("Size: "+stack.size());
        stack.printStack();
    }
}
