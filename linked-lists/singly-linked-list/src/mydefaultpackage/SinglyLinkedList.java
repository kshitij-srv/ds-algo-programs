package mydefaultpackage;

public class SinglyLinkedList {
  private int length = 0;
  ListNode head;

  public SinglyLinkedList() {
    length = 0;
  }

  public synchronized ListNode getHead() {
    return this.head;
  }

  public synchronized void printList() {
    ListNode currentNode = head;

    while (currentNode != null) {
      System.out.printf("%d -> ", currentNode.getData());
      currentNode = currentNode.getNext();
    }
  }

  public synchronized int listLength() {
    return length;
  }

  public synchronized void insertAtBeginning(ListNode node) {
    node.setNext(head);
    head = node;
    length++;
  }

  public synchronized void insertAtEnd(ListNode node) {
    if (head == null) {
      head = node;
    } else {
      ListNode currentNode = head;
      while(currentNode.getNext() != null) {
        currentNode = currentNode.getNext();
      }
      currentNode.setNext(node);
    }
    length++;
  }

  public synchronized void insertAtPosition(ListNode node, int position) {
    if (position < 1) {
      position = 1;
    }

    if (position > length + 1) {
      position = length + 1;
    }

    if (head == null) {
      head = node;
    } else if (position == 1) {
      node.setNext(head);
      head = node;
    } else {
      ListNode currentNode = head;

      for (int i = 2; i < position; i++) {
        currentNode = currentNode.getNext();
      }
      node.setNext(currentNode.getNext());
      currentNode.setNext(node);
    }

    length++;
  }

  public synchronized ListNode removeFromBeginning() {
    ListNode currentNode = head;
    if (head != null) {
      head = head.getNext();
      currentNode.setNext(null);
      length--;
    }
    return currentNode;
  }

  public synchronized ListNode removeFromEnd() {
    ListNode currentNode = head;

    if (head == null) {
      return null;
    }

    if (head.getNext() == null) {
      head = null;
      length--;
      return currentNode;
    }
    
    ListNode nextNode = currentNode.getNext();

    while(nextNode.getNext() != null) {
      currentNode = nextNode;
      nextNode = nextNode.getNext();
    }

    currentNode.setNext(null);

    length--;
    return nextNode;
  }

  public synchronized ListNode removeMatchedNode(ListNode node) {
    ListNode currentNode = head;

    if (head == null) {
      return null;
    }

    if (head.getData() == node.getData()) {
      head = head.getNext();
      length--;
      return currentNode;
    }

    ListNode nextNode = currentNode.getNext();

    while (nextNode != null) {
      if (nextNode.getData() == node.getData()) {
        currentNode.setNext(nextNode.getNext());
        length--;
        return nextNode;
      }
      currentNode = nextNode;
      nextNode = nextNode.getNext();
    }
    
    return null;
  }

  public synchronized ListNode removeFromPosition(int position) {
    ListNode currentNode = head;

    if (head == null) {
      return null;
    }
    
    if (position < 1) {
      position = 1;
    }

    if (position > length) {
      position = length;
    }

    if (position == 1) {
      head = head.getNext();
      length--;
      return currentNode;
    }

    ListNode nextNode = currentNode.getNext();

    for (int i = 2; i < position; i++) {
      currentNode = nextNode;
      nextNode = nextNode.getNext();
    }

    currentNode.setNext(nextNode.getNext());

    length--;
    return nextNode;
  }

  public synchronized void clearList() {
    head = null;
    length = 0;
  }
}
