package mydefaultpackage;

public class Main {
    public static void main(String args[]) {
        // array queue operations
        ArrayQueue queue = new ArrayQueue(5);
        try {
            queue.enqueue(1);
        } catch (IllegalStateException err) {
            System.err.println(err);
        }
        System.out.println(queue.toString());
        try {
            queue.enqueue(2);
        } catch (IllegalStateException err) {
            System.err.println(err);
        }
        System.out.println(queue.toString());
        try {
            queue.enqueue(3);
        } catch (IllegalStateException err) {
            System.err.println(err);
        }
        System.out.println(queue.toString());
        try {
            queue.enqueue(4);
        } catch (IllegalStateException err) {
            System.err.println(err);
        }
        System.out.println(queue.toString());
        try {
            queue.enqueue(5);
        } catch (IllegalStateException err) {
            System.err.println(err);
        }
        System.out.println(queue.toString());
        try {
            queue.enqueue(6);
        } catch (IllegalStateException err) {
            System.err.println(err);
        }
        System.out.println(queue.toString());
        try {
            int data = queue.dequeue();
            System.out.println(data);
        } catch (IllegalStateException err) {
            System.err.println(err);
        }
        System.out.println(queue.toString());
        try {
            queue.enqueue(6);
        } catch (IllegalStateException err) {
            System.err.println(err);
        }
        System.out.println(queue.toString());
    }
}
