package LinkedLists;

public class LinkedListRunner {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.addAtHead(1);
        linkedList.addAtTail(3);
        linkedList.addAtIndex(1,2);
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(0));
        linkedList.deleteAtIndex(1);
        linkedList.get(1);

    }
}
