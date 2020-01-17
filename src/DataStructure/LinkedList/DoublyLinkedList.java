package DataStructure.LinkedList;

public class DoublyLinkedList {
    public class Node {
        int data;
        Node next;
        Node previous;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node head;
    public Node tail;
    public int length = 0;

    public boolean isEmpty() {
        return head == null;
    }

    public int length() {
        return length;
    }

    public void showForward() {
        Node node = head;
        while (node.next != null) {
            System.out.print(node.data + "-->");
            node = node.next;
        }
        System.out.print(node.data);
    }

    public void showBackward() {
        Node node = tail;
        while (node.previous != null) {
            System.out.print(node.data + "-->");
            node = node.previous;
        }
        System.out.print(node.data);
    }

    public void insertAtStart(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            length++;
        } else {
            length++;
            node.next = head;
            head = node;
            node.next.previous = node;
        }
    }

    public void insert(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            length++;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            length++;
            temp.next = node;
            node.previous = temp;
        }
        tail = node;
    }

    public void deleteAt(int index) {
        Node node = head;
        Node temp;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        temp = node.next;
        node.previous.next = temp;
        temp = node.previous;
        node.next.previous = temp;
        length--;
    }

    public void insertAtIndex(int index, int data) {
        Node node = new Node(data);
        Node left_node = head;
        Node right_node;
        if (index == 0) {
            insertAtStart(data);
        } else {
            for (int i = 0; i < index - 1; i++) {
                left_node = left_node.next;
            }
            right_node = left_node.next;

            left_node.next = node;
            node.previous = left_node;

            node.next = right_node;
            right_node.previous = node;

            length++;

        }
    }
}
