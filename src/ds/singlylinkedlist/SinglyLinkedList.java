package ds.singlylinkedlist;

public class SinglyLinkedList {
    private Node first;

    public SinglyLinkedList(){

    }

    public boolean isEmpty(){
        return first == null;
    }

    //used to insert at the beginning of the list
    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.next = first;
        first = newNode;
    }

    public Node deleteFirst(){
        Node temp = first;
        first = first.next;
        return temp;
    }

    public void displayList(){
        System.out.println("List (first --> last)");
    }
}
