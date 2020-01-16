package DataStructure.Stack;

public class Stack<T> {
    private class Node{
        private T data;
        private Node next;
        private Node(T data){
            this.data = data;
        }
    }
    private Node top;

    public void push(T data){
        Node node = new Node(data);
        node.next = top;
        top = node;
    }
    public boolean isEmpty(){
        return top == null;
    }
    public T pop(){
        T data = top.data;
        top = top.next;
        return data;
    }
    public T peek(){
        return top.data;
    }
}
