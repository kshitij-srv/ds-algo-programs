package mydefaultpackage;

import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;

public class BinaryTree {

    // pre-order traversal
    public void preOrder(BTNode root) {
        if (root != null) {
            System.out.println(root.getData());
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }

    // in-order traversal
    public void inOrder(BTNode root) {
        if (root != null) {
            inOrder(root.getLeft());
            System.out.println(root.getData());
            inOrder(root.getRight());
        }
    }

    // post-order traversal
    public void postOrder(BTNode root) {
        if (root != null) {
            postOrder(root.getLeft());
            postOrder(root.getRight());
            System.out.println(root.getData());
        }
    }

    // level-order traversal
    public void levelOrder(BTNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        Queue<BTNode> queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            BTNode current = queue.remove();
            if (current.getLeft() != null) {
                queue.add(current.getLeft());
            }
            if (current.getRight() != null) {
                queue.add(current.getRight());
            }
            result.add(current.getData());
        }

        System.out.println(result);
    }

    // get max value in binary tree
    /* Can also be done using level order traversal */
    public int findMax(BTNode root) {
        int max = Integer.MIN_VALUE;
        if (root != null) {
            int leftMax = findMax(root.getLeft());
            int rightMax = findMax(root.getRight());

            if (leftMax >= rightMax) {
                max = leftMax;
            } else {
                max = rightMax;
            }

            if (root.getData() > max) {
                max = root.getData();
            }
        }

        return max;
    }

    // search element in binary tree
    /* Can also be done using level order traversal */
    public boolean searchInBT(BTNode root, int data) {
        if (root == null) {
            return false;
        }
        if (data == root.getData()) {
            return true;
        }
        return searchInBT(root.getLeft(), data) || searchInBT(root.getRight(), data);
    }

    // insert element in binary tree
    /** can be done using level order traversal */
    public BTNode insertNode(BTNode root, int data) {
        Queue<BTNode> queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);
            while (!queue.isEmpty()) {
                BTNode current = queue.remove();
                if (current.getLeft() != null) {
                    queue.add(current.getLeft());
                } else {
                    current.setLeft(new BTNode(data));
                    break;
                }
                if (current.getRight() != null) {
                    queue.add(current.getRight());
                } else {
                    current.setRight(new BTNode(data));
                    break;
                }
            }
        } else {
            root = new BTNode(data);
        }

        return root;
    }

    // get size of binary tree
    /** Can also be done using level order traversal */
    public int getSize(BTNode root) {
        if (root == null) {
            return 0;
        }
        int sizeOfLeftSubTree = getSize(root.getLeft());
        int sizeOfRightSubTree = getSize(root.getRight());
        return sizeOfLeftSubTree + sizeOfRightSubTree + 1;
    }

    // get height of binary tree (no of nodes from root to deepest lead node)
    public int getHeight(BTNode root) {
        if (root == null) {
            return 0;
        }
        int heightOfLeftSubTree = getHeight(root.getLeft());
        int heightOfRightSubTree = getHeight(root.getRight());
        if (heightOfLeftSubTree >= heightOfRightSubTree) {
            return heightOfLeftSubTree + 1;
        } else {
            return heightOfRightSubTree + 1;
        }
    }

    // check if two binary trees are structurely same
    public boolean areTreesSimilar(BTNode root1, BTNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }

        if (root1 == null || root2 == null) {
            return false;
        }

        return areTreesSimilar(root1.getLeft(), root2.getLeft()) && areTreesSimilar(root1.getRight(), root2.getRight());
    }

    // print all root to leaf paths
    /** start */
    public void printPaths(BTNode root) {
        ArrayList<Integer> path = new ArrayList<Integer>();
        printPathHelper(root, path, 1);
    }

    public void printPathHelper(BTNode root, ArrayList<Integer> path, int pathLength) {
        if (root == null) {
            return;
        }
        path.add(pathLength, root.getData());
        pathLength++;
        if (root.getLeft() == null && root.getRight() == null) {
            System.out.println(path);
        } else {
            printPathHelper(root.getLeft(), path, pathLength);
            printPathHelper(root.getRight(), path, pathLength);
        }
    }
    /** end */
}
