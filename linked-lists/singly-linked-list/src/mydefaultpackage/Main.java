package mydefaultpackage;

public class Main {
  public static void main(String args[]) {
    SinglyLinkedList myList = new SinglyLinkedList();
    myList.insertAtBeginning(new ListNode(5));
    myList.insertAtEnd(new ListNode(3));
    myList.printList();
    System.out.println();
    System.out.println(myList.listLength());
    myList.insertAtEnd(new ListNode(11));
    myList.printList();
    System.out.println();
    System.out.println(myList.listLength());
    myList.insertAtPosition(new ListNode(20), 2);
    myList.printList();
    System.out.println();
    System.out.println(myList.listLength());
    myList.insertAtPosition(new ListNode(35), 3);
    myList.printList();
    System.out.println();
    System.out.println(myList.listLength());
    System.out.printf("2nd node from the end: %d", myList.nthNodeFromTheEnd(2).getData());
    System.out.println();
    myList.removeMatchedNode(new ListNode(20));
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
