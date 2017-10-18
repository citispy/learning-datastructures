package ds.queue;

public class Queue {
    private int maxSize;
    private long[] queArray;
    private int front; //index position for the first element in the queue
    private int rear; //index position for the last element in the queue
    private int nItems; //maintains the number of items in the queue

    public Queue(int size) {
        this.maxSize = size;
        this.queArray = new long[size];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(long j) {
        if (rear == maxSize - 1) {
            rear = -1; //prevents array index out of bounds exception and allows old items to be replaced by new ones
        }

        rear++;
        queArray[rear] = j;
        nItems++;
    }

    public void view() {
        System.out.print("[ ");
        for (int i = 0; i < queArray.length; i++) {
            System.out.print(queArray[i] + " ");
        }
        System.out.print("]");
    }

    public long remove() { //remove item from the front of the queue
        long temp = queArray[front];
        front++;
        nItems--;
        if (front == maxSize) {
            front = 0; // set front to 0 so we can use the entire array again
        }

        return temp;
    }

    public long peekFront() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public boolean isFull() {
        return nItems == maxSize;
    }
}
