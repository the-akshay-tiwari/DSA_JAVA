package lec5Func;

import java.util.*;

public class conversion {
  public static int binToDec(int num){
    int pow = 1;
    int dec =0;
    while(num!=0){
      int dig = num%10;
      dec+=pow*dig;
      pow*=2;
      num/=10;
    }
    return dec;
  }

  public static int decToBin(int num){
    int binNum=0;
    int pow=1;
    while(num!=0){
      int rem = num%2;
      binNum=binNum + rem*pow;
      pow*=10;
      num/=2;

    }
    return binNum;
  }


  public static void main(String args[]){
    Scanner sc = new Scanner((System.in));
    System.out.print("enter the number : ");
    int decNum=sc.nextInt();
    System.out.print("The binary of "+decNum +" is : "+decToBin(decNum));
    int binNum=sc.nextInt();
    System.out.print("The binary of "+decNum +" is : "+binToDec(binNum));
    sc.close();


    
  }
}
