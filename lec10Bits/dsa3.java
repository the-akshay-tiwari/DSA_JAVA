package lec10Bits;

public class dsa3 {

  public static int getIthBit(int n,int i){
    return (n&(1<<i))==0?0:1;
  }

  public static int setIthBit(int n,int i){
    return n|(1<<i);
  }

  public static int clearIthBit(int n,int i){
    int bitMask=~(1<<i);
    return n&(bitMask);
  }

  public static int updateIthBit(int n,int i,int newBit){
    // if(newBit==0){
    //   return clearIthBit(n, i);
    // }
    // else{
    //   return setIthBit(n, i);
    // }

    n=clearIthBit(n,i);
    return n|(newBit<<i);

  }

  public static int clearRangeBits(int n,int i,int j){
    int a=((~0)<<(j+1));
    //int b=(int)Math.pow(2, i)-1;
    int b=(1<<i)-1;
    int bitMask=a|b;
    return n& bitMask;
  }

  public static boolean isPowOf2(int n){
    if((n&(n-1))==0){
      return true;
    }
    else{
      return false;
    }
  }

  public static void main(String[] args) {
    
    System.out.println(isPowOf2(8));

  }
  
}
