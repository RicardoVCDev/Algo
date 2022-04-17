package com.jon.learning.udemy.tree;

public class BinaryTreeNode<T extends Comparable> {
    private T value;
    private BinaryTreeNode<T> right;
    private BinaryTreeNode<T> left;

    public BinaryTreeNode() { }

    public BinaryTreeNode(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public BinaryTreeNode<T> getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode<T> right) {
        this.right = right;
    }

    public BinaryTreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode<T> left) {
        this.left = left;
    }

    public void insert(T value) {
        if (value.compareTo(this.value) > 0) {
            if (this.right == null) {
                this.right = new BinaryTreeNode<>(value);
            } else {
                this.right.insert(value);
            }
        } else {
            if (this.left == null) {
                this.left = new BinaryTreeNode<>(value);
            } else {
                this.left.insert(value);
            }
        }
    }
}
