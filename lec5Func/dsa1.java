package lec5Func;

public class dsa1 {
  public static int fact(int n){
    int f=1;
    for(int i=1;i<=n;i++){
      f*=i;
    }
    return f;
  }

  public static int binCoeff(int n,int r){
    return (fact(n)/(fact(r)*fact(n-r)));
  }

  public static void checkPrime(int n){
    for(int i=2;i*i<=n;i++){
      if(n%i==0){
        System.out.println(n+" is not a prime number.");
        return;
      }
    }
    System.out.println(n+" is a prime number");
  }

  public static void main(String[] args) {
    for(int i=2;i<=20;i++){
      checkPrime(i);
    }
  }
}