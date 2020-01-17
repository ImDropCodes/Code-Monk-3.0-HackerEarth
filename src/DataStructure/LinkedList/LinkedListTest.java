package DataStructure.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        DoublyLinkedList dd = new DoublyLinkedList();
        dd.insert(20);
        dd.insert(30);
        dd.insertAtStart(10);
        dd.insertAtStart(5);
        dd.insert(40);

        dd.showForward();
        System.out.println();
        dd.showBackward();
        System.out.println();
        System.out.println(dd.length());

        dd.deleteAt(3);
        System.out.println();
        dd.showForward();
        System.out.println();
        System.out.println(dd.length());

        dd.deleteAt(2);
        System.out.println();
        dd.showForward();
        System.out.println();
        System.out.println(dd.length());

        dd.insertAtIndex(2,20);
        System.out.println();
        dd.showForward();
        System.out.println();
        System.out.println(dd.length());

        dd.insertAtIndex(3,30);
        System.out.println();
        dd.showForward();
        System.out.println();
        System.out.println(dd.length());

        dd.insertAtIndex(0,2);
        System.out.println();
        dd.showForward();
        System.out.println();
        System.out.println(dd.length());

        dd.insertAtIndex(0,1);
        System.out.println();
        dd.showForward();
        System.out.println();
        System.out.println(dd.length());

        System.out.println();
        dd.showBackward();

        System.out.println();
        System.out.println(dd.isEmpty());

    }
}
