package lec12Recurssion;

public class dsa5 {
  //calculate x^n

  public static int pow(int base,int exp){
    if(exp==0)return 1;
    return base*pow(base,exp-1);
  }

  //optimizes approach
  public static int power(int base,int exp){
    if(exp==0)return 1;
    int halfPow=power(base,exp/2);
    int halfPowSq=halfPow*halfPow;
    if(exp%2==0)return halfPowSq;
    else return base*halfPowSq;
  }

  public static void main(String[] args) {
    System.out.println(power(2,5));
  }
}
