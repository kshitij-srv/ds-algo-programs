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
        System.out.println("Pre-order traversal");
        bTree.preOrder(one);
        System.out.println();
        System.out.println("In-order traversal");
        bTree.inOrder(one);
        System.out.println();
        System.out.println("Post-order traversal");
        bTree.postOrder(one);
        System.out.println();
        System.out.println("Level-order traversal");
        bTree.levelOrder(one);
        System.out.println();
        System.out.println("Size of tree (number of nodes)");
        System.out.println(bTree.getSize(one));
        System.out.println();
        System.out.println("Max element in tree");
        System.out.println(bTree.findMax(one));
        System.out.println();
        System.out.println("Search for number 3 in the tree");
        System.out.println(bTree.searchInBT(one, 3));
        System.out.println();
        System.out.println("Search for number 9 in the tree");
        System.out.println(bTree.searchInBT(one, 9));
        System.out.println();
        bTree.insertNode(one, 8);
        bTree.levelOrder(one);
        System.out.println();
        System.out.println("Size of tree (number of nodes)");
        System.out.println(bTree.getSize(one));
        System.out.println();
        System.out.println("Height of binary tree");
        System.out.println(bTree.getHeight(one));
        System.out.println();
        System.out.println("Check tree similarity: one and one");
        System.out.println(bTree.areTreesSimilar(one, one));
        System.out.println();
        BTNode anotherOne = new BTNode(one.getData(), one.getLeft(), one.getRight()); // creating new tree to compare
        anotherOne.setRight(new BTNode(9));
        bTree.levelOrder(anotherOne);
        bTree.levelOrder(one);
        System.out.println("Check tree similarity: one and anotherOne");
        System.out.println(bTree.areTreesSimilar(one, anotherOne));
        System.out.println();
        System.out.println("Print all paths from root to leaf for one");
        bTree.printPaths(one);
        System.out.println();
        System.out.println("Print all paths from root to leaf for anotherOne");
        bTree.printPaths(anotherOne);
    }
}
