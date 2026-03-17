package lec10Bits;

public class dsa4 {

  public static int countSetBits(int n){
    int num=n;
    int count=0;
    while(num>0){
      int lastDig=num&1;
      if(lastDig==1){
        count++;
      }
      num=num>>1;
    }
    return count;
  }

  //fast exponentiation
  public static int fastExpo(int a,int n){
    int ans=1;
    while(n>0){
      if((n&1)==1){
        ans=ans*a;
      }
      a*=a;
      n>>=1;
    }
    return ans;
  }

  public static void main(String[] args) {
    System.out.println(fastExpo(2,7));
  }
}
