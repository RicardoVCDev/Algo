package com.jon.learning.tree;

public class TreeA<T extends Comparable> {
    TreeNodeA<T> root;

    public boolean insert(T value) {
        if (root == null) {
            this.root = new TreeNodeA<>(value);
            return true;
        }
        return root.insert(value);
    }

    public boolean exists(T value) {
        return root.get(value) != null;
    }

    public void delete(T value) {
        this.root = delete(root, value);
    }

    /**
     * If input subNode is null, return null.
     * If input value is less than input subNode's value, set the input subNode's left
     * sub node as the result of a recursive delete(subNode.getLeft(), value).
     * Else if input value is greater than input subNode's value, set the input subNode's
     * right sub node as the result of a recursive delete(subNode.getRight(), value).
     * Else, input subNode's value is equal to the input value and should be deleted/replaced.
     *  - if input subNode left sub node is null, return input subNode's right sub node.
     *  - else, if input subNode right sub node is null, return input subNode's left sub node.
     *  - else, means subNode that is to be deleted have both left and right sub nodes.
     * @param subNode child node to be checked for the given value and be processed.
     * @param value value of the node to be deleted.
     * @return the Node that was replaced or nulled.
     */
    private TreeNodeA<T> delete(TreeNodeA<T> subNode, T value) {
        if (subNode == null) return null;

        if (value.compareTo(subNode.getValue()) < 0) {
            subNode.setLeft(delete(subNode.getLeft(), value));
        } else if (value.compareTo(subNode.getValue()) > 0) {
            subNode.setRight(delete(subNode.getRight(), value));
        } else {
            if (subNode.getLeft() == null) {
                return subNode.getRight();
            } else if (subNode.getRight() == null) {
                return subNode.getLeft();
            } else {
                subNode.setValue(subNode.getLeft().getMax().getValue());
                subNode.setLeft(delete(subNode.getLeft(), subNode.getValue()));
            }
        }

        return subNode;
    }
}
