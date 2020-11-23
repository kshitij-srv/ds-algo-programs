package mydefaultpackage;

public class Main {
    public static void main(String args[]) {
        BTNode one = new BTNode(1);
        BTNode two = new BTNode(2);
        BTNode three = new BTNode(3);
        BTNode four = new BTNode(4);
        BTNode five = new BTNode(5);
        BTNode six = new BTNode(6);
        BTNode seven = new BTNode(7);
        one.setLeft(two);
        one.setRight(three);
        two.setLeft(four);
        two.setRight(five);
        three.setLeft(six);
        three.setRight(seven);
        BinaryTree bTree = new BinaryTree();
        bTree.preOrder(one);
        System.out.println();
        bTree.inOrder(one);
        System.out.println();
        bTree.postOrder(one);
        System.out.println();
        bTree.levelOrder(one);
    }
}
