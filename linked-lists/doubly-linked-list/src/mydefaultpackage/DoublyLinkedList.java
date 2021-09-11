package mydefaultpackage;

public class DoublyLinkedList {
  private int length = 0;
  DListNode head;

  public DoublyLinkedList() {
    this.length = 0;
  }

  public synchronized DListNode getHead() {
    return this.head;
  }

  public synchronized void printList() {
    DListNode currentNode = this.head;

    while (currentNode != null) {
      System.out.printf("<- %d -> ", currentNode.getData());
      currentNode = currentNode.getNext();
    }
  }

  public synchronized int listLength() {
    return this.length;
  }

  public synchronized void insertAtBeginning(DListNode node) {
    if (this.head == null) {
      this.head = node;
    } else {
      node.setNext(this.head);
      this.head.setPrev(node);
      this.head = node;
    }
    this.length++;
  }

  public synchronized void insertAtEnd(DListNode node) {
    if (this.head == null) {
      this.head = node;
    } else {
      DListNode currentNode = this.head;
      while(currentNode.getNext() != null) {
        currentNode = currentNode.getNext();
      }
      currentNode.setNext(node);
      node.setPrev(currentNode);
    }
    this.length++;
  }

  public synchronized void insertAtPosition(DListNode node, int position) {
    if (position < 1) {
      position = 1;
    }

    if (position > this.length + 1) {
      position = this.length + 1;
    }

    if (this.head == null) {
      this.head = node;
    } else if (position == 1) {
      node.setNext(this.head);
      this.head.setPrev(node);
      this.head = node;
    } else {
      DListNode currentNode = this.head;

      for (int i = 0; i < position - 2; i++) {
        currentNode = currentNode.getNext();
      }
      node.setNext(currentNode.getNext());
      currentNode.getNext().setPrev(node);
      currentNode.setNext(node);
    }

    this.length++;
  }

  public synchronized DListNode removeFromBeginning() {
    DListNode currentNode = this.head;
    if (this.head != null) {
      this.head = this.head.getNext();
      this.head.setPrev(null);
      currentNode.setNext(null);
      this.length--;
    }
    return currentNode;
  }

  public synchronized DListNode removeFromEnd() {
    DListNode currentNode = this.head;

    if (this.head == null) {
      return null;
    }

    if (this.head.getNext() == null) {
      this.head = null;
      this.length--;
      return currentNode;
    }
    
    DListNode nextNode = currentNode.getNext();

    while(nextNode.getNext() != null) {
      currentNode = nextNode;
      nextNode = nextNode.getNext();
    }

    currentNode.setNext(null);
    nextNode.setPrev(null);

    this.length--;
    return nextNode;
  }

  public synchronized DListNode removeMatchedNode(DListNode node) {
    DListNode currentNode = this.head;

    if (this.head == null) {
      return null;
    }

    if (this.head.getData() == node.getData()) {
      this.head = this.head.getNext();
      this.head.setPrev(null);
      currentNode.setNext(null);
      this.length--;
      return currentNode;
    }

    DListNode nextNode = currentNode.getNext();

    while (nextNode != null) {
      if (nextNode.getData() == node.getData()) {
        currentNode.setNext(nextNode.getNext());
        nextNode.getNext().setPrev(currentNode);
        nextNode.setNext(null);
        nextNode.setPrev(null);
        this.length--;
        return nextNode;
      }
      currentNode = nextNode;
      nextNode = nextNode.getNext();
    }
    
    return null;
  }

  public synchronized DListNode removeFromPosition(int position) {
    DListNode currentNode = this.head;

    if (this.head == null) {
      return null;
    }
    
    if (position < 1) {
      position = 1;
    }

    if (position > this.length) {
      position = this.length;
    }

    if (position == 1) {
      this.head = this.head.getNext();
      this.head.setPrev(null);
      currentNode.setNext(null);
      this.length--;
      return currentNode;
    }

    DListNode nextNode = currentNode.getNext();

    for (int i = 0; i < position - 2; i++) {
      currentNode = nextNode;
      nextNode = nextNode.getNext();
    }

    currentNode.setNext(nextNode.getNext());
    nextNode.getNext().setPrev(currentNode);
    nextNode.setNext(null);
    nextNode.setPrev(null);

    this.length--;
    return nextNode;
  }

  public synchronized void clearList() {
    this.head = null;
    this.length = 0;
  }
}
