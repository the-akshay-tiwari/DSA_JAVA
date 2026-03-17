package lec2;

import java.util.*;

public class calc {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    char optr=sc.next().charAt(0);

    switch(optr){
      case '+' : System.out.println(a+b);break;
      case '-' : System.out.println(a-b);break;
      case '*' : System.out.println(a*b);break;
      case '/' : System.out.println((float)a/b);break;
      case '%' : System.out.println(a%b);
    }

    sc.close();
  }
}
