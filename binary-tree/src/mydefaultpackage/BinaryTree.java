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
}
