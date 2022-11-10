package com.jon.learning.tree;

public class TreeNodeTry<T extends Comparable> {
    private T value;
    private TreeNodeTry<T> left;
    private TreeNodeTry<T> right;

    public TreeNodeTry() { }

    public TreeNodeTry(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public TreeNodeTry<T> getLeft() {
        return left;
    }

    public void setLeft(TreeNodeTry<T> left) {
        this.left = left;
    }

    public TreeNodeTry<T> getRight() {
        return right;
    }

    public void setRight(TreeNodeTry<T> right) {
        this.right = right;
    }

    public boolean insert(T value) {
        if (value.compareTo(this.value) == 0) return false;

        if (value.compareTo(this.value) < 0) {
            if (this.left == null) {
                this.left = new TreeNodeTry<>(value);
                return true;
            }
            return this.left.insert(value);
        } else {
            if (this.right == null) {
                this.right = new TreeNodeTry<>(value);
                return true;
            }
            return this.right.insert(value);
        }
    }

    public TreeNodeTry<T> get(T value) {
        if (value.compareTo(this.value) ==0) return this;
        if (value.compareTo(this.value) < 0)
            return this.left.get(value);
        else
            return this.right.get(value);
    }
}
