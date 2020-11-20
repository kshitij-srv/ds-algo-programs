package mydefaultpackage;

public class Main {
    public static void main(String args[]) {
        ArrayStack stack;
        if (args.length > 0) {
            stack = new ArrayStack(Integer.parseInt(args[0]));
        } else {
            stack = new ArrayStack();
        }
        System.out.println("Is stack full?");
        System.out.println(stack.isFull());
        System.out.println();
        System.out.println("Is stack empty?");
        System.out.println(stack.isEmpty());
        System.out.println();
        System.out.println("Insert 1");
        System.out.println();
        try {
            stack.push(1);
        } catch (Exception err) {
            System.err.println(err);
        }
        System.out.println("Insert 2");
        System.out.println();
        try {
            stack.push(2);
        } catch (Exception err) {
            System.err.println(err);
        }
        System.out.println("Insert 3");
        System.out.println();
        try {
            stack.push(3);
        } catch (Exception err) {
            System.err.println(err);
        }
        System.out.println("Insert 4");
        System.out.println();
        try {
            stack.push(4);
        } catch (Exception err) {
            System.err.println(err);
        }
        System.out.println("Insert 5");
        System.out.println();
        try {
            stack.push(5);
        } catch (Exception err) {
            System.err.println(err);
        }
        System.out.println("Insert 6");
        System.out.println();
        try {
            stack.push(6);
        } catch (Exception err) {
            System.err.println(err);
        }
        System.out.println("Insert 7");
        System.out.println();
        try {
            stack.push(7);
        } catch (Exception err) {
            System.err.println(err);
        }
        System.out.println("Insert 8");
        System.out.println();
        try {
            stack.push(8);
        } catch (Exception err) {
            System.err.println(err);
        }
        System.out.println("Insert 9");
        System.out.println();
        try {
            stack.push(9);
        } catch (Exception err) {
            System.err.println(err);
        }
        System.out.println("Insert 10");
        System.out.println();
        try {
            stack.push(10);
        } catch (Exception err) {
            System.err.println(err);
        }
        System.out.println("Insert 11");
        System.out.println();
        try {
            stack.push(11);
        } catch (Exception err) {
            System.err.println(err);
        }
        System.out.println();
        System.out.println("Peek top element");
        try {
            System.out.println(stack.peek());
        } catch (Exception err) {
            System.err.println(err);
        }
        System.out.println();
        System.out.println("Stack size");
        System.out.println(stack.stackSize());
        System.out.println();
        System.out.println("Stack elements");
        System.out.println(stack.toString());
        System.out.println();
        System.out.println("Pop element");
        try {
            System.out.println(stack.pop());
        } catch (Exception err) {
            System.err.println(err);
        }
        System.out.println();
        System.out.println("Peek top element");
        try {
            System.out.println(stack.peek());
        } catch (Exception err) {
            System.err.println(err);
        }
        System.out.println();
        System.out.println("Stack size");
        System.out.println(stack.stackSize());
        System.out.println();
        System.out.println("Stack elements");
        System.out.println(stack.toString());
        System.out.println();
        System.out.println("Insert 100");
        try {
            stack.push(100);
        } catch (Exception err) {
            System.err.println(err);
        }
        System.out.println();
        System.out.println("Peek top element");
        try {
            System.out.println(stack.peek());
        } catch (Exception err) {
            System.err.println(err);
        }
        System.out.println();
        System.out.println("Stack size");
        System.out.println(stack.stackSize());
        System.out.println();
        System.out.println("Stack elements");
        System.out.println(stack.toString());
    }
}
