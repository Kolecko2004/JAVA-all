package cz.cvut.fel.pjv.impl;

import cz.cvut.fel.pjv.Node;
import cz.cvut.fel.pjv.Tree;

public class TreeImpl implements Tree {
    private NodeImpl root;

    public TreeImpl() {
        this.root = null;
    }

    private NodeImpl createTree(int[] values, int start, int end) {
        if (start > end) return null;
        int middle = (start + end) / 2;

        if ((end - start + 1) % 2 == 0) {
            middle++;
        }

        NodeImpl node = new NodeImpl(values[middle]);
        node.left = createTree(values, start, middle - 1);
        node.right = createTree(values, middle + 1, end);
        return node;
    }

    @Override
    public void setTree(int[] values) {
        root = createTree(values, 0, values.length - 1);
    }

    @Override
    public Node getRoot() {
        return root;
    }

    @Override
    public String toString() {
        return buildString(root, 0);
    }

    private String buildString(NodeImpl node, int level) {
        if (node == null) return "";

        StringBuilder str = new StringBuilder();

        str.append(" ".repeat(level)).append("- ").append(node.value).append("\n");
        str.append(buildString(node.left, level + 1));
        str.append(buildString(node.right, level + 1));
        return str.toString();
    }

}
