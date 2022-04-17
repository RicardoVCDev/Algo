package com.jon.learning.udemy.tree;

public class BinarySearchTree<T extends Comparable> {
    private BinaryTreeNode<T> head;
    private int size;

    /**
     * Add a node in the tree.
     * Create a new Node with the given input value.
     * Increment size.
     * Look at the head.
     * 1) If it is null, set it as the new Node.
     * 2) If given value is greater than the current node's value, get the right node.
     * 2.1) Go to step 1.
     * 2.2) Else, call right node's insert function.
     * 3) Else, get the left node.
     * 3.1) Go to step 1.
     * 3.2) Else, call left node's insert function.
     * @param value
     */
    public void insert(T value) {
        size++;
        //         15
        //   11          25
        //8      13  19       32
        if (head == null)  {
            head = new BinaryTreeNode<>(value);
        }  else if (value.compareTo(head.getValue()) > 0) {
            if (head.getRight() == null) {
                head.setRight(new BinaryTreeNode<>(value));
            } else {
                head.getRight().insert(value);
            }
        } else {
            if (head.getLeft()==null) {
                head.setLeft(new BinaryTreeNode<>(value));
            } else {
                head.getLeft().insert(value);
            }
        }
    }
}
