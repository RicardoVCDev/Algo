package com.jon.learning.tree;

import java.util.Objects;

public class TreeNodeA<T extends Comparable> {
    private T value;
    private TreeNodeA<T> left;
    private TreeNodeA<T> right;

    public TreeNodeA() {}

    public TreeNodeA(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public TreeNodeA<T> getLeft() {
        return left;
    }

    public void setLeft(TreeNodeA<T> left) {
        this.left = left;
    }

    public TreeNodeA<T> getRight() {
        return right;
    }

    public void setRight(TreeNodeA<T> right) {
        this.right = right;
    }

    /**
     * If input value is equal to the current node's value, return false
     * If input value is less than the current node's value, put the value on the left child
     *  - if left node is null, create a new TreeNode1 with the input value and
     *  set it to be this node's left child node.
     *  - else, return the insert(...) function of the left child node.
     * Else, If right node is null, create a TreeNode with the input value and
     *  set it to be this node's right child node.
     *  - else, return the insert(...) function of the right child node.
     * @param value value of the node to insert.
     * @return true if the insert was successful, false otherwise.
     */
    public boolean insert(T value) {
        if (Objects.equals(value, this.value)) return false;
        if (value.compareTo(this.value) < 0) {
            if (this.left == null) {
                this.left = new TreeNodeA<>(value);
                return true;
            }
            return this.left.insert(value);
        } else {
            if (this.right == null) {
                this.right = new TreeNodeA<>(value);
                return true;
            }
            return this.right.insert(value);
        }
    }

    public TreeNodeA<T> get(T value) {
        if (Objects.equals(value, this.value)) return this;
        if (value.compareTo(this.value) < 0) {
            if (this.left != null) return this.left.get(value);
        } else {
            if (this.right != null) return this.right.get(value);
        }

        return null;
    }

    public void delete(T value) {
        if (Objects.equals(value, this.value)) return;

        if (value.compareTo(this.value) < 0) {
            if (this.left.getValue().equals(value)) this.left = null;
        } else {
            if (this.right.getValue().equals(value)) this.right = null;
        }

        return;
    }

    public TreeNodeA<T> getMin() {
        if (this.left == null) {
            return this;
        } else {
            return this.left.getMin();
        }
    }

    public TreeNodeA<T> getMax() {
        if (this.right == null) {
            return this;
        } else {
            return this.right.getMax();
        }
    }

    public boolean isLeaf() {
        return this.left == null
                && this.right == null;
    }
}
