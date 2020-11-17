package mydefaultpackage;

public class Main {
  public static void main(String args[]) {
    DoublyLinkedList myList = new DoublyLinkedList();
    myList.insertAtBeginning(new DListNode(5));
    myList.insertAtEnd(new DListNode(3));
    myList.printList();
    System.out.println();
    System.out.println(myList.listLength());
    myList.insertAtEnd(new DListNode(11));
    myList.printList();
    System.out.println();
    System.out.println(myList.listLength());
    myList.insertAtPosition(new DListNode(20), 2);
    myList.printList();
    System.out.println();
    System.out.println(myList.listLength());
    myList.insertAtPosition(new DListNode(35), 3);
    myList.printList();
    System.out.println();
    System.out.println(myList.listLength());
    myList.removeMatchedNode(new DListNode(20));
    myList.printList();
    System.out.println();
    System.out.println(myList.listLength());
    myList.removeFromPosition(3);
    myList.printList();
    System.out.println();
    System.out.println(myList.listLength());
    myList.clearList();
    myList.printList();
    System.out.println(myList.listLength());
  }
}
