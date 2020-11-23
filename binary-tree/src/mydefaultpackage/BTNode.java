package mydefaultpackage;

public class BTNode {
    private BTNode left;
    private BTNode right;
    private int data;

    public BTNode(int data) {
        this(data, null, null);
    }

    public BTNode(int data, BTNode left, BTNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BTNode getLeft() {
        return this.left;
    }

    public void setLeft(BTNode node) {
        this.left = node;
    }

    public BTNode getRight() {
        return this.right;
    }

    public void setRight(BTNode node) {
        this.right = node;
    }
}
