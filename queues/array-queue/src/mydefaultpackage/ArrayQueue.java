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
        this.queue = new int[this.capacity];
        this.size = 0;
        this.front = -1;
        this.rear = -1;
    }

    // insert element into queue
    public void enqueue(int data) throws IllegalStateException {
        if (this.size == this.capacity) {
            throw new IllegalStateException("Overflow [" + Integer.toString(data) + "]: queue is full");
        }
        this.rear = (this.rear + 1) % this.capacity;
        if (this.front == -1) {
            this.front = this.rear;
        }
        this.queue[this.rear] = data;
        this.size++;
    }

    // remove element from queue
    public int dequeue() throws IllegalStateException {
        if (this.size == 0) {
            throw new IllegalStateException("Underflow: queue is empty");
        }
        int data = this.queue[this.front];
        this.queue[this.front] = Integer.MIN_VALUE;
        this.front = (this.front + 1) % this.capacity;
        this.size--;
        return data;
    }

    // check if queue is empty
    public boolean isEmpty() {
        return this.size == 0;
    }

    // check is queue is full
    public boolean isFull() {
        return this.size == this.capacity;
    }

    // get size of queue
    public int size() {
        return this.size;
    }

    // print the contents of the queue
    public String toString() {
        String str = "";
        if (this.size > 0) {
            int tempFront = this.front;
            str = Integer.toString(this.queue[tempFront]);
            tempFront = (tempFront + 1) % this.capacity;
            for (int i = 1; i < this.size; i++) {
                str += ", " + Integer.toString(this.queue[tempFront]);
                tempFront = (tempFront + 1) % this.capacity;
            }
        }
        return "[" + str + "]";
    }
}
