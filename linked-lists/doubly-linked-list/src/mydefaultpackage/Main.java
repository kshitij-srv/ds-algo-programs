package mydefaultpackage;

public class Main {
  public static void main(String args[]) {
    DoublyLinkedList myList = new DoublyLinkedList();
    // 1
    myList.insertAtBeginning(new DListNode(5));
    // 2
    myList.insertAtEnd(new DListNode(3));
    myList.printList();
    System.out.println();
    System.out.println(myList.listLength());
    // 3
    myList.insertAtEnd(new DListNode(11));
    myList.printList();
    System.out.println();
    System.out.println(myList.listLength());
    // 4
    myList.insertAtPosition(new DListNode(20), 2);
    myList.printList();
    System.out.println();
    System.out.println(myList.listLength());
    // 5
    myList.insertAtPosition(new DListNode(35), 3);
    myList.printList();
    System.out.println();
    System.out.println(myList.listLength());
    // 6
    myList.removeMatchedNode(new DListNode(20));
    myList.printList();
    System.out.println();
    System.out.println(myList.listLength());
    // 7
    myList.removeFromPosition(3);
    myList.printList();
    System.out.println();
    System.out.println(myList.listLength());
    // 8
    myList.clearList();
    myList.printList();
    System.out.println(myList.listLength());
  }
}
