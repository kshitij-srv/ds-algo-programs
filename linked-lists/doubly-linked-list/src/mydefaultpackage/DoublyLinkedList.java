package mydefaultpackage;

public class DoublyLinkedList {
  private int length = 0;
  DListNode head;

  public DoublyLinkedList() {
    length = 0;
  }

  public synchronized DListNode getHead() {
    return this.head;
  }

  public synchronized void printList() {
    DListNode currentNode = head;

    while (currentNode != null) {
      System.out.printf("<- %d -> ", currentNode.getData());
      currentNode = currentNode.getNext();
    }
  }

  public synchronized int listLength() {
    return length;
  }

  public synchronized void insertAtBeginning(DListNode node) {
    if (head == null) {
      head = node;
    } else {
      node.setNext(head);
      head.setPrev(node);
      head = node;
    }
    length++;
  }

  public synchronized void insertAtEnd(DListNode node) {
    if (head == null) {
      head = node;
    } else {
      DListNode currentNode = head;
      while(currentNode.getNext() != null) {
        currentNode = currentNode.getNext();
      }
      currentNode.setNext(node);
      node.setPrev(currentNode);
    }
    length++;
  }

  public synchronized void insertAtPosition(DListNode node, int position) {
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
      DListNode currentNode = head;

      for (int i = 2; i < position; i++) {
        currentNode = currentNode.getNext();
      }
      node.setNext(currentNode.getNext());
      currentNode.getNext().setPrev(node);
      currentNode.setNext(node);
    }

    length++;
  }

  public synchronized DListNode removeFromBeginning() {
    DListNode currentNode = head;
    if (head != null) {
      head = head.getNext();
      head.setPrev(null);
      currentNode.setNext(null);
      length--;
    }
    return currentNode;
  }

  public synchronized DListNode removeFromEnd() {
    DListNode currentNode = head;

    if (head == null) {
      return null;
    }

    if (head.getNext() == null) {
      head = null;
      length--;
      return currentNode;
    }
    
    DListNode nextNode = currentNode.getNext();

    while(nextNode.getNext() != null) {
      currentNode = nextNode;
      nextNode = nextNode.getNext();
    }

    currentNode.setNext(null);
    nextNode.setPrev(null);

    length--;
    return nextNode;
  }

  public synchronized DListNode removeMatchedNode(DListNode node) {
    DListNode currentNode = head;

    if (head == null) {
      return null;
    }

    if (head.getData() == node.getData()) {
      head = head.getNext();
      head.setPrev(null);
      currentNode.setNext(null);
      length--;
      return currentNode;
    }

    DListNode nextNode = currentNode.getNext();

    while (nextNode != null) {
      if (nextNode.getData() == node.getData()) {
        currentNode.setNext(nextNode.getNext());
        nextNode.getNext().setPrev(currentNode);
        nextNode.setNext(null);
        nextNode.setPrev(null);
        length--;
        return nextNode;
      }
      currentNode = nextNode;
      nextNode = nextNode.getNext();
    }
    
    return null;
  }

  public synchronized DListNode removeFromPosition(int position) {
    DListNode currentNode = head;

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
      head.setPrev(null);
      currentNode.setNext(null);
      length--;
      return currentNode;
    }

    DListNode nextNode = currentNode.getNext();

    for (int i = 2; i < position; i++) {
      currentNode = nextNode;
      nextNode = nextNode.getNext();
    }

    currentNode.setNext(nextNode.getNext());
    nextNode.getNext().setPrev(currentNode);
    nextNode.setNext(null);
    nextNode.setPrev(null);

    length--;
    return nextNode;
  }

  public synchronized void clearList() {
    head = null;
    length = 0;
  }
}
