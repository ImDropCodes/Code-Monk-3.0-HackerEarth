package DataStructure.Queue;

public class Queue_int {
    public int[] queue;
    public int front;
    public int rear;
    public int size;

    public Queue_int(int size) {
        this.size = size;
        queue = new int[size];
        front = 0;
        rear = 0;
    }

    public void enqueue(int ele) {
        if (rear == size) {
        } else {
            queue[rear] = ele;
            rear++;
        }
    }

    public int dequeue() {
        int x = queue[front];
        if (rear == front) {
        } else {
            queue[front] = 0;
            front++;
        }
        return x;
    }

    public int front(){
        return queue[front];
    }

    public boolean isEmpty(){
        return (rear == front);
    }

    public int size(){
        return (rear-front);
    }
}
