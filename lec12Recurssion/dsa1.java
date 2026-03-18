package lec12Recurssion;

public class dsa1 {
  
  //print numbers from n to 1(Decreasing order) using recurssive function

  public static void printNumDec(int n){
    System.out.print(n+" ");
    if(n==1)return;
    printNumDec(n-1);
  }

  //print numbers from n to 1(Decreasing order) using recurssive function
  public static void printNumInc(int n){
    if(n==0){
      return;
    }
    printNumInc(n-1);
    System.out.print(n+" ");
  }

  public static void main(String[] args) {
    printNumInc(15);
  }

}
