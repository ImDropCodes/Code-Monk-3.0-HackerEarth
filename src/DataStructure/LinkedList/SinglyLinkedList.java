package DataStructure.LinkedList;

public class SinglyLinkedList<T> {

    //Node sub class
    public class Node {
        public T data;
        public Node next;

        public Node(T data) {
            this.data = data;
        }
    }

    public Node head;

    public boolean isEmpty() {
        return head == null;
    }

    public void insert(T data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void insertAtStart(T data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void insertAt(int index, T data) {
        Node node = new Node(data);
        if (index == 0) {
            insertAtStart(data);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }
    }

    public void delete(int index){
        Node temp = head;
        Node node = null;
        for (int i = 0 ; i < index-1;i++){
            temp = temp.next;
        }
        node = temp.next;
        temp.next = node.next;
    }

    public void show(){
        Node node = head;
        while (node.next!=null){
            System.out.print(node.data+ "-->");
            node = node.next;
        }
        System.out.print(node.data);
    }

}
