package mydefaultpackage;

public class ArrayQueue {
    private int[] queue;
    private int size;
    private int front;
    private int rear;
    private int capacity;
    private static final int CAPACITY = 10;

    public ArrayQueue() {
        this(CAPACITY);
    }

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[this.capacity];
        size = 0;
        front = -1;
        rear = -1;
    }

    // insert element into queue
    public void enqueue(int data) throws IllegalStateException {
        if (size == capacity) {
            throw new IllegalStateException("Overflow [" + Integer.toString(data) + "]: queue is full");
        }
        rear = (rear + 1) % capacity;
        if (front == -1) {
            front = rear;
        }
        queue[rear] = data;
        size++;
    }

    // remove element from queue
    public int dequeue() throws IllegalStateException {
        if (size == 0) {
            throw new IllegalStateException("Underflow: queue is empty");
        }
        int data = queue[front];
        queue[front] = Integer.MIN_VALUE;
        front = (front + 1) % capacity;
        size--;
        return data;
    }

    // check if queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // check is queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // get size of queue
    public int size() {
        return size;
    }

    // print the contents of the queue
    public String toString() {
        String str = "";
        if (size > 0) {
            int tempFront = front;
            str = Integer.toString(queue[tempFront]);
            tempFront = (tempFront + 1) % capacity;
            for (int i = 1; i < size; i++) {
                str += ", " + Integer.toString(queue[tempFront]);
                tempFront = (tempFront + 1) % capacity;
            }
        }
        return "[" + str + "]";
    }
}
