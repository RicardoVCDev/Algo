package com.jon.learning.list;

import com.jon.learning.model.Employee;

public class EmployeeDoublyNode {
    private Employee employee;
    private EmployeeDoublyNode previous;
    private EmployeeDoublyNode next;

    public EmployeeDoublyNode(Employee employee) {
        this.employee = employee;
    }

    public EmployeeDoublyNode getPrevious() {
        return previous;
    }

    public void setPrevious(EmployeeDoublyNode previous) {
        this.previous = previous;
    }

    public EmployeeDoublyNode getNext() {
        return next;
    }

    public void setNext(EmployeeDoublyNode next) {
        this.next = next;
    }

    public Employee getEmployee() {
        return employee;
    }
}
