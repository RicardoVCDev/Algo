package com.jon.learning.tree;

public class TreeNode {
    private int value;
    private TreeNode leftNode;
    private TreeNode rightNode;

    public TreeNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public void insert(int value) {
        if (value < this.value) {
            if (leftNode == null) {
                this.setLeftNode(new TreeNode(value));
            } else {
                leftNode.insert(value);
            }
        } else if (value > this.value) {
            if (rightNode == null) {
                this.rightNode = new TreeNode(value);
            } else {
                rightNode.insert(value);
            }
        }
    }

    public void traverseInOrder() {
        if (leftNode != null) leftNode.traverseInOrder();
        System.out.print(value+", ");
        if (rightNode != null) rightNode.traverseInOrder();
    }

    public TreeNode get(int value) {
        if (value == this.value) return this;

        if (value < this.value) {
            if (leftNode != null)  return leftNode.get(value);
        } else {
            if (rightNode != null) return rightNode.get(value);
        }

        return null;
    }

    public int min() {
        if (leftNode == null) return this.value;
        return leftNode.min();
    }

    public int max() {
        if (rightNode == null) return this.value;
        return rightNode.max();
    }

    @Override
    public String toString() {
        return "value = " + value;
    }
}
