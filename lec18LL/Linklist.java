package lec18LL;

public class Linklist {
  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
      count++;
    }

  }

  static int count = 0;

  public Node head, tail;

  public void init() {
    head = tail = null;
  }

  public void addFirst(int data) {
    Node tempNode = new Node(data);
    if (head == null) {
      head = tail = tempNode;
      return;
    }
    tempNode.next = head;
    head = tempNode;
  }

  public void addLast(int data) {
    Node tempNode = new Node(data);
    if (tail == null) {
      head = tail = tempNode;
      return;
    }
    tail.next = tempNode;
    tail = tempNode;
  }

  public void insert(int idx, int data) {
    if (idx == 0) {
      addFirst(data);
      return;
    }
    if (idx == this.size() - 1) {
      addLast(data);
      return;
    }
    Node temp = head;
    for (int i = 0; i < idx - 1; i++) {
      temp = temp.next;
    }
    Node newNode = new Node(data);
    newNode.next = temp.next;
    temp.next = newNode;
  }

  public int removeFirst() {
    if (head == null) {
      System.out.println("LL is empty");
      return Integer.MAX_VALUE;
    }
    if (head == tail) {
      int x = head.data;
      head = tail = null;
      count--;
      return x;
    }
    int x = head.data;
    head = head.next;
    count--;
    return x;
  }

  public int removeLast() {
    if (tail == null) {
      System.out.println("LL is empty");
      return Integer.MAX_VALUE;
    }
    if (head == tail) {
      int x = tail.data;
      head = tail = null;
      count--;
      return x;
    }
    Node temp = head;
    while (temp.next != tail) {
      temp = temp.next;
    }
    int x = tail.data;
    tail = temp;
    tail.next = null;
    count--;
    return x;
  }

  public int remNthFromEnd(int n) {
    int m = this.size() - n;
    if (m == 0) {
      return removeFirst();
    }
    if (m == count - 1) {
      return removeLast();
    }
    if (n > this.size()) {
      System.out.println("index out of bound");
      return Integer.MAX_VALUE;
    }
    Node pre = null;
    Node curr = this.head;
    for (int i = 0; i < m; i++) {
      pre = curr;
      curr = curr.next;
    }
    pre.next = curr.next;
    int val = curr.data;
    return val;

  }

  public void display(Node head) {
    if (head == null) {
      System.out.println("LL is empty.");
    }
    Node tempNde = head;
    while (tempNde != null) {
      System.out.print(tempNde.data + "->");
      tempNde = tempNde.next;
    }
    System.out.println("null");
  }

  public int size() {
    return count;
  }

  public int search(int key) {
    Node temp = head;
    int idx = 0;
    while (temp != null) {
      if (temp.data == key)
        return idx;
      temp = temp.next;
      idx++;
    }
    return -1;
  }

  public int search(Node node, int key, int idx) {
    if (node == null)
      return -1;
    if (node.data == key)
      return idx;
    return search(node.next, key, idx + 1);
  }

  public void reverse(Node head) {
    if (head == null) {
      System.out.println("LL is empty");
      return;
    }
    Node preNode = null;
    Node currNode = head;
    while (currNode != null) {
      Node nextNode = head.next;
      currNode.next = preNode;
      preNode = currNode;
      currNode = nextNode;
    }
    this.tail = head;
    this.head = preNode;
  }
}
