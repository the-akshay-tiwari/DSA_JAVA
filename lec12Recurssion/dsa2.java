package lec12Recurssion;

public class dsa2 {
  //recurssive funtion to find factorial of a number

  public static int fact(int n){
    if(n==0)return 1;
    return n*fact(n-1);
  }

  //print sum of first n natural numbers
  public static int firstNSum(int n){
    if(n==1)return 1;
    return n+firstNSum(n-1);
  }

  public static void main(String[] args) {
    System.out.println(firstNSum(5));
  }

}
