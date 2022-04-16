package com.jon.learning.udemy.linkedlist;

public class Singly {
    private Node head;
    private Node tail;
    private int size;

    public Singly() {}

    public Singly(Node head) {
        this.head = head;
    }

    public void append(String value) {
        //a->b->c
        Node node = new Node(value, null);
        if (this.tail == null) {
            this.head = node;
        } else {
            this.tail.setNext(node);
        }
        this.tail = node;
        size++;
    }

    public void prepend(String value) {
        //c->b->a
        Node node = new Node(value, null);
        if (this.head == null) {
            this.tail = node;
        } else {
            node.setNext(this.head);
        }
        this.head = node;
        size++;
    }

    public int getSize() { return this.size; }

    public String getAllValues() {
        StringBuffer sb = new StringBuffer(size);
        Node node = this.head;
        while (node != null) {
            sb.append(node.getValue());
            sb.append(",");
            node = node.getNext();
        }

        return sb.toString().substring(0, sb.length() - 1);
    }

    class Node {
        private String value;
        private Node next;

        public Node(String value, Node next) {
            this.value = value;
            this.next = next;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
