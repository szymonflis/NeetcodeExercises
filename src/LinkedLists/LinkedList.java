package LinkedLists;

public class LinkedList {

    Node head = null;
    Node tail = null;
    int size = 0;

    public LinkedList() {
    }


    public int get(int index) {
        //check if requested index is valid
        if (index < 0 || index >= size)
            return -1;

        //create a temporary pointer node and use that to loop
        Node pointerNode = head;
        for (int i = 0; i < index; i++) {
            pointerNode = pointerNode.nextNode;
        }
        return pointerNode.value;
    }

    public void addAtHead(int val) {
        //create a node, set the nextNode field in it to the existing head of the list
        Node newNode = new Node(val);
        newNode.nextNode = head;
        newNode.previousNode = null;
        //update the head to be the newest node
        head = newNode;
        if(size == 0){
            tail = head;
        }
        size ++;
    }

    public void addAtTail(int val) {
        //if size is 0 then just reuse add at head
        if(size == 0){
            addAtHead(val);
        }
        //else make the tails' nextNode the new node and update tail to be that new node.
        else {
            tail.nextNode = new Node(val);
            tail = tail.nextNode;
            size++;
        }
    }

    public void addAtIndex(int index, int val) {
        //check if requested index is valid
        if(index == size)
            addAtTail(val);

        else if (index == 0)
            addAtHead(val);

        else if (index < 0 || index > size)
            return;

        else{
            //create pointer node and stop at the node before desired index
            Node pointerNode = head;
            for (int i = 0; i < index -1 ; i++) {
                pointerNode = pointerNode.nextNode;
            }
            Node nodeToAdd = new Node(val);
            nodeToAdd.nextNode = pointerNode.nextNode;
            nodeToAdd.previousNode = pointerNode;
            pointerNode.nextNode = nodeToAdd;
            size++;

        }

        //create a temporary pointer node and use that to loop


    }

    private Node getNodeAtIndex(int index) {
        if(index < 0 || index >= size)
            return null;

        Node temp = head;
        for(int i=0; i<index; i++){
            temp = temp.nextNode;
        }
        return temp;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size)
            return;

        // if only 1 item in list then make head and tail null so it is empty
        else if(size == 1){
            head = null;
            tail = null;
        }

        //if deleting the first node then just point head ot the one after
        else if (index == 0){
            head = head.nextNode;
        }

        // if deleting the last node then get the previous one and set nextNode to null and reassign the tial

        else if (index == size-1){
            Node previousNode = getNodeAtIndex(index-1);
            previousNode.nextNode = null;
            tail = previousNode;
        }

        //any other scenario, get the previous node to desired deletion index, set the next node field  on the previous node to be 1 past the intended node to delete

        else {
            Node previousNode = getNodeAtIndex(index-1);
            previousNode.nextNode = previousNode.nextNode.nextNode;
        }

        size--;

    }


}
