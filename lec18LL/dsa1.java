package lec18LL;

//basics of linked list

class Node{
  int data;
  Node next;

  public Node(int data){
    this.data=data;
    this.next=null;
  }
}

public class dsa1 {
  public static void main(String[] args) {
    Node n1=new Node(10); 
    // Node n2=new Node(20);
    // Node n3=new Node(30);
    // Node n4=new Node(40);

    System.out.println(n1.data);
  }
}
