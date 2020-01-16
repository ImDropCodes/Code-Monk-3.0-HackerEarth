package DataStructure.Queue;

public class Queue<T> {
    private class Node {
        private T data;
        private Node next;

        private Node(T data) {
            this.data = data;
        }
    }

    private Node tail;
    private Node head;
    int head_count = 0;
    int tail_count = 0;

    public boolean isEmpty() {
        return head == null;
    }

    public T peek() {
        return head.data;
    }

    public void enqueue(T data) {
        Node node = new Node(data);
        if (tail != null) {
            tail.next = node;
        }
        tail_count++;
        tail = node;
        if (head == null) {
            head = node;
        }
    }

    public T dequeue() {
        T data = head.data;
        head = head.next;
        head_count++;
        return data;
    }

    public int size() {
        return (tail_count - head_count);
    }
}
