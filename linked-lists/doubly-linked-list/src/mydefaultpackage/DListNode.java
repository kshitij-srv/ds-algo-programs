package mydefaultpackage;

public class DListNode {
  private int data;
  private DListNode next;
  private DListNode prev;

  public DListNode(int data) {
    this.data = data;
    this.next = null;
    this.prev = null;
  }

  public DListNode(int data, DListNode next, DListNode prev) {
    this.data = data;
    this.next = next;
    this.prev = prev;
  }

  public void setData(int data) {
    this.data = data;
  }

  public int getData() {
    return this.data;
  }

  public void setNext(DListNode next) {
    this.next = next;
  }

  public DListNode getNext() {
    return this.next;
  }

  public void setPrev(DListNode prev) {
    this.prev = prev;
  }

  public DListNode getPrev() {
    return this.prev;
  }
}
