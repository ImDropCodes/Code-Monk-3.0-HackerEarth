package DataStructure.Queue;

public class Queue_chr {
    public char[] queue;
    public int front;
    public int rear;
    public int size;

    public Queue_chr(int size) {
        this.size = size;
        queue = new char[size];
        front = 0;
        rear = 0;
    }

    public void enqueue(char ele) {
        if (rear == size) {
            System.out.println("OverFlow");
        } else {
            queue[rear] = ele;
            rear++;
        }
    }

    public void dequeue() {
        if (rear == front) {
            System.out.println("UnderFlow");
        } else {
            queue[front] = 0;
            front++;
        }
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
