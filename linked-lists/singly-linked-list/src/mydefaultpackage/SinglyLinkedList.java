package mydefaultpackage;

public class SinglyLinkedList {
  private int length = 0;
  ListNode head;

  public SinglyLinkedList() {
    this.length = 0;
    this.head = null;
  }

  public synchronized ListNode getHead() {
    return this.head;
  }

  public synchronized void printList() {
    ListNode currentNode = this.head;

    while (currentNode != null) {
      System.out.printf("%d -> ", currentNode.getData());
      currentNode = currentNode.getNext();
    }
  }

  public synchronized int listLength() {
    return this.length;
  }

  public synchronized void insertAtBeginning(ListNode node) {
    node.setNext(this.head);
    this.head = node;
    this.length++;
  }

  // this method can be optimized with a little memory trade-off
  // by maintaining a tail node to track the last list item
  public synchronized void insertAtEnd(ListNode node) {
    if (this.head == null) {
      this.head = node;
    } else {
      ListNode currentNode = this.head;
      while(currentNode.getNext() != null) {
        currentNode = currentNode.getNext();
      }
      currentNode.setNext(node);
    }
    this.length++;
  }

  public synchronized void insertAtPosition(ListNode node, int position) {
    if (position < 1) {
      position = 1;
    }

    if (position > length + 1) {
      position = length + 1;
    }

    if (this.head == null) {
      this.head = node;
    } else if (position == 1) {
      node.setNext(this.head);
      this.head = node;
    } else {
      ListNode currentNode = this.head;

      for (int i = 0; i < position - 2; i++) {
        currentNode = currentNode.getNext();
      }
      node.setNext(currentNode.getNext());
      currentNode.setNext(node);
    }

    this.length++;
  }

  public synchronized ListNode removeFromBeginning() {
    ListNode currentNode = this.head;
    if (this.head != null) {
      this.head = this.head.getNext();
      currentNode.setNext(null);
      this.length--;
    }
    return currentNode;
  }

  public synchronized ListNode removeFromEnd() {
    ListNode currentNode = this.head;

    if (this.head == null) {
      return null;
    }

    if (this.head.getNext() == null) {
      this.head = null;
      this.length--;
      return currentNode;
    }
    
    ListNode nextNode = currentNode.getNext();

    while(nextNode.getNext() != null) {
      currentNode = nextNode;
      nextNode = nextNode.getNext();
    }

    currentNode.setNext(null);

    this.length--;
    return nextNode;
  }

  public synchronized ListNode removeMatchedNode(ListNode node) {
    ListNode currentNode = this.head;

    if (this.head == null) {
      return null;
    }

    if (this.head.getData() == node.getData()) {
      this.head = this.head.getNext();
      this.length--;
      return currentNode;
    }

    ListNode nextNode = currentNode.getNext();

    while (nextNode != null) {
      if (nextNode.getData() == node.getData()) {
        currentNode.setNext(nextNode.getNext());
        this.length--;
        return nextNode;
      }
      currentNode = nextNode;
      nextNode = nextNode.getNext();
    }
    
    return null;
  }

  public synchronized ListNode removeFromPosition(int position) {
    ListNode currentNode = this.head;

    if (this.head == null) {
      return null;
    }
    
    if (position < 1) {
      position = 1;
    }

    if (position > length) {
      position = length;
    }

    if (position == 1) {
      this.head = this.head.getNext();
      this.length--;
      return currentNode;
    }

    ListNode nextNode = currentNode.getNext();

    for (int i = 0; i < position - 2; i++) {
      currentNode = nextNode;
      nextNode = nextNode.getNext();
    }

    currentNode.setNext(nextNode.getNext());

    this.length--;
    return nextNode;
  }

  public synchronized ListNode nthNodeFromTheEnd(int position) {
    ListNode pTemp = this.head;
    ListNode pNthNode = null;

    for (int i = 1; i < position; i++) {
      if (pTemp != null) {
        pTemp = pTemp.getNext();
      } else {
        i = position;
      }
    }

    while (pTemp != null) {
      if (pNthNode == null) {
        pNthNode = head;
      } else {
        pNthNode = pNthNode.getNext();
      }
      pTemp = pTemp.getNext();
    }

    return pNthNode;
  }

  public synchronized void reverseLinkedListRecursive(ListNode prev, ListNode current) {
    if(current == null) {
      this.head = prev;
      return;
    }
    ListNode next = current.getNext();
    reverseLinkedListRecursive(current, next);
    current.setNext(prev);
  }

  public synchronized void reverseLinkedList() {
    ListNode currentNode = head;
    ListNode previousNode = null;
    ListNode nextNode = null;

    while (currentNode != null) {
      nextNode = currentNode.getNext();
      currentNode.setNext(previousNode);
      previousNode = currentNode;
      currentNode = nextNode;
    }
    this.head = previousNode;
  }

  public synchronized void clearList() {
    this.head = null;
    this.length = 0;
  }
}
