package lec18LL;

class LL {
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

  public void reverse() {
    if (this.head == null) {
      System.out.println("LL is empty");
      return;
    }
    Node preNode = null;
    Node currNode = this.head;
    while (currNode != null) {
      Node nextNode = this.head.next;
      currNode.next = preNode;
      preNode = currNode;
      currNode = nextNode;
    }
    this.tail = this.head;
    this.head = preNode;
  }

  public static Node reverse(Node node) {
    if (node == null) {
      System.out.println("LL is empty");
      return node;
    }
    Node preNode = null;
    Node currNode = node;
    while (currNode != null) {
      Node nextNode = currNode.next;
      currNode.next = preNode;
      preNode = currNode;
      currNode = nextNode;
    }
    // this.tail = head;
    // this.head = preNode;
    return preNode;
  }

  // detecting a loop in a linklist
  public boolean isLoopPresent() {
    Node slow = this.head;
    Node fast = this.head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        return true;
      }
    }
    return false;
  }

  // remove a cycle
  public void removeCycle() {
    Node slow = this.head;
    Node fast = this.head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        slow = this.head;
        while (fast.next != slow.next) {
          slow = slow.next;
          fast = fast.next.next;
        }
        fast.next = null;
        return;
      }
    }
    ;

  }

  // merge sort on a Linked List
  public static Node returnMid(Node head) {
    Node slow = head;
    Node fast = head.next;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  public Node mergeSort(Node head) {
    if(head==null || head.next==null){
      return head;
    }
    // finding the mid
    Node mid = returnMid(head);
    Node rhead = mid.next;
    mid.next = null;
    // calling for left part and right part
    Node newLeft = mergeSort(head);
    Node newRight = mergeSort(rhead);
    // merging
    return merge(newLeft, newRight);
  }

  public static Node merge(Node left, Node right) {
    Node mergedLL = new Node(-1);
    Node temp = mergedLL;
    while (left != null && right != null) {
      if (left.data <= right.data) {
        temp.next = left;
        left = left.next;
        temp = temp.next;
      } else {
        temp.next = right;
        right = right.next;
        temp = temp.next;
      }
    }
    while (left != null) {
      temp.next = left;
      left = left.next;
      temp = temp.next;
    }
    while (right != null) {
      temp.next = right;
      right = right.next;
      temp = temp.next;
    }
    return mergedLL.next;
  }

  //convert LL to zig-zag manner

  public Node zigZagLL(){
    Node mid=returnMid(head);
    Node rhead=mid.next;
    mid.next=null;
    Node rightRev=reverse(rhead);
    Node zigZag=new Node(-1);
    Node temp=zigZag;
    while(head!=null && rightRev!=null){
      temp.next=head;
      temp=temp.next;
      head=head.next;
      temp.next=rightRev;
      rightRev=rightRev.next;
      temp=temp.next;
    }
    if(head!=null){
      temp.next=head;
    }
    if(rightRev!=null){
      temp.next=rightRev;
    }
    return zigZag.next;
  }

}

public class dsa2 {
  public static void main(String[] args) {
    LL list = new LL();
    list.init();
    list.addFirst(1);
    list.addLast(2);
    list.addLast(3);
    list.addLast(4);
    list.addLast(5);
    list.addLast(6);
    list.addLast(7);
    list.addLast(8);
    list.addLast(9);
    // list.insert(1,10);
    // list.display(list.head);
    // System.out.println("size = "+list.size());
    // list.removeFirst();
    // list.display(list.head);
    // System.out.println("size = "+list.size());
    // list.removeLast();
    // list.display(list.head);
    // System.out.println("size = "+list.size());
    // System.out.println(list.search(10));
    // System.out.println(list.search(list.head,10,0));
    // list.reverse(list.head);
    // list.addFirst(6);
    // list.addLast(0);
    // list.remNthFromEnd(3);
    // list.tail.next=list.head;
    //list.display(list.head);
    // System.out.println(list.isLoopPresent());
    // list.removeCycle();
    // System.out.println(list.isLoopPresent());
    // list.head=list.mergeSort(list.head);
    list.display(list.head);
    list.head=list.zigZagLL();
    list.display(list.head);

  }
}
