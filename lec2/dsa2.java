package lec2;

import java.util.*;

public class dsa2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your income in Rs. : ");
    long incm=sc.nextInt();
    if(incm<500000){
      System.out.println("no tax to be paid.");
    }
    else if(incm<1000000){
      System.out.println("tax to be paid ="+(0.2*incm));
    }
    else{
      System.out.println("tax to be paid ="+(0.3*incm));
    }

    sc.close();
  }
}
