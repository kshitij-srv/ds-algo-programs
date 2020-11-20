package mydefaultpackage;

public class ArrayStack {
    // maximum stack capacity
    protected int capacity;
    // default stack capacity
    public static final int CAPACITY = 10;
    // array to represent stack
    protected int[] stack;
    // stack array topmost index tracker
    protected int top = -1;

    // initialize the stack
    public ArrayStack() {
        this(CAPACITY);
    }

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        stack = new int[this.capacity];
    }

    // get stack size in O(1) time
    public int stackSize() {
        return top + 1;
    }

    // check if stack is empty
    public boolean isEmpty() {
        return top < 0;
    }

    // check if stack is full
    public boolean isFull() {
        return stackSize() == capacity;
    }

    // insert new element on top of stack
    public void push(int data) throws Exception {
        if (isFull()) {
            throw new Exception("Stack is full");
        }
        stack[++top] = data;
    }

    // peek the top element of the stack
    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        return stack[top];
    }

    // remove top element from stack
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        int data = stack[top];
        stack[top--] = Integer.MIN_VALUE;
        return data;
    }

    // get a string representation of the stack
    public String toString() {
        String s = "";
        int size = stackSize();

        if (size > 0) {
            s += stack[0];
        }

        if (size > 1) {
            for (int i = 1; i < size; i++) {
                s += ", " + stack[i];
            }
        }

        return "[" + s + "]";
    }
}
