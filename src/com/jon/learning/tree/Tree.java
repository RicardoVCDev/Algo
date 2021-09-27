package com.jon.learning.tree;

public class Tree {
    private TreeNode root;

    public void insert(int value) {
        if (this.root == null) {
            this.root = new TreeNode(value);
        } else if (value < this.root.getValue()) {
            if (this.root.getLeftNode() == null) {
                this.root.setLeftNode(new TreeNode(value));
            } else {
                this.root.getLeftNode().insert(value);
            }
        } else if (value > this.root.getValue()) {
            if (this.root.getRightNode() == null) {
                this.root.setRightNode(new TreeNode(value));
            } else {
                this.root.getRightNode().insert(value);
            }
        }
    }

    public void traverseInOrder() {
        if (root != null) {
            if (root.getLeftNode() != null) root.getLeftNode().traverseInOrder();
            System.out.print(root.getValue()+", ");
            if (root.getRightNode() != null) root.getRightNode().traverseInOrder();
        }
        System.out.println("null");
    }

    public TreeNode get(int value) {
        if (root != null) {
            if (value < root.getValue()) {
                if (root.getLeftNode() != null) return root.getLeftNode().get(value);
            } else if (value > root.getValue()) {
                if (root.getRightNode() != null) return root.getRightNode().get(value);
            } else {
                return root;
            }
        }
        return null;
    }

    public int min() {
        if (root != null) {
            return root.getLeftNode().min();
        }
        return Integer.MIN_VALUE;
    }

    public int max() {
        if (root != null) {
            return root.getRightNode().max();
        }

        return Integer.MAX_VALUE;
    }

    public void delete(int value) {
        root = delete(root, value);
    }

    public TreeNode delete(TreeNode subtreeRoot, int value) {
        if (subtreeRoot == null) return subtreeRoot;
        if (value < subtreeRoot.getValue()) {
            subtreeRoot.setLeftNode(delete(subtreeRoot.getLeftNode(), value));
        } else if (value > subtreeRoot.getValue()) {
            subtreeRoot.setRightNode(delete(subtreeRoot.getRightNode(), value));
        } else {
            if (subtreeRoot.getLeftNode() == null) {
                return subtreeRoot.getRightNode();
            } else {
                return subtreeRoot.getLeftNode();
            }
        }

        return subtreeRoot;
    }
}
