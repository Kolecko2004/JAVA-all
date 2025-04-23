package cz.cvut.fel.pjv.impl;

import cz.cvut.fel.pjv.Node;

public class NodeImpl implements Node {

    int value;
    NodeImpl left;
    NodeImpl right;

    public NodeImpl(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    @Override
    public Node getLeft() { return left; }

    @Override
    public Node getRight() {
        return right;
    }

    @Override
    public int getValue() {
        return value;
    }
}
