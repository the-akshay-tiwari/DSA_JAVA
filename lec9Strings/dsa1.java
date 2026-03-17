package lec9Strings;

import java.util.*;

public class dsa1 {
  //introduction to strings
  
  public static void main(String[] args) {
    //char arr[]={'s','t','r','i','n','g'};
    String str="string";
    String str2=new String("string");

    Scanner sc= new Scanner(System.in);
    String str3=sc.next();
    System.out.println(str3);

    System.out.print(str.charAt(0)+" "+str2.charAt(3)+" "+str3.charAt(2));

    sc.close();
  }


}
