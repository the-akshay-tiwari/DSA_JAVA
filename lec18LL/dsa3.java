package lec18LL;

//merge sort on a Linked List 

public class dsa3 {

  public static Node returnMid(Node head) {
    Node slow = head;
    Node fast = head;

    while (fast.next.next != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  public static void mergeSort(Node head) {
    Node mid = returnMid(head);
    Node rhead=mid.next;
    mid.next=null;
    mergeSort(head);
    mergeSort(rhead);
    merge(head, rhead);
  }

  public static void merge(Node head, Node rhead) {
    Linklist list = new Linklist();
    Node temp = head; 
    Node ttemp = rhead;
    while (temp != null && ttemp != null) {
      list.addLast(Math.min(temp.data, ttemp.data));
      temp = temp.next;
      ttemp = ttemp.next;
    }
    while (temp != null) {
      list.addLast(temp.data);
      temp = temp.next;
    }
    while (ttemp != null) {
      list.addLast(ttemp.data);
      ttemp = ttemp.next;
    }
    
  }

}
