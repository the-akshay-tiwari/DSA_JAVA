package lec2;

import java.util.*;

public class dsa1 {
  public static void main(String arg[]){ 
    Scanner sc = new Scanner((System.in));

    System.out.print("enter first number : ");
    int a = sc.nextInt();
    System.out.print("enter second number : ");
    int b = sc.nextInt();
    if(a>b){
      System.out.println("the larger number is : "+a);
    }
    else{
      System.out.println("the larger number is : "+b);
    }

    sc.close();


  }
}