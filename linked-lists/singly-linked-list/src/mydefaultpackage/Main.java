package mydefaultpackage;

public class Main {
  public static void main(String args[]) {
    SinglyLinkedList myList = new SinglyLinkedList();
    // 1
    myList.insertAtBeginning(new ListNode(5));
    // 2
    myList.insertAtEnd(new ListNode(3));
    myList.printList();
    System.out.println();
    System.out.println(myList.listLength());
    // 3
    myList.insertAtEnd(new ListNode(11));
    myList.printList();
    System.out.println();
    System.out.println(myList.listLength());
    // 4
    myList.insertAtPosition(new ListNode(20), 2);
    myList.printList();
    System.out.println();
    System.out.println(myList.listLength());
    // 5
    myList.insertAtPosition(new ListNode(35), 3);
    myList.printList();
    System.out.println();
    System.out.println(myList.listLength());
    // 6
    System.out.printf("2nd node from the end: %d", myList.nthNodeFromTheEnd(2).getData());
    System.out.println();
    // 7
    myList.removeMatchedNode(new ListNode(20));
    myList.printList();
    System.out.println();
    System.out.println(myList.listLength());
    // 8
    myList.removeFromPosition(3);
    myList.printList();
    System.out.println();
    System.out.println(myList.listLength());
    // 9
    System.out.println(myList.getHead().getData());
    myList.reverseLinkedListRecursive(null, myList.getHead());
    myList.printList();
    System.out.println();
    // 10
    myList.reverseLinkedList();
    myList.printList();
    System.out.println();
    // 11
    myList.clearList();
    myList.printList();
    System.out.println(myList.listLength());
  }
}
