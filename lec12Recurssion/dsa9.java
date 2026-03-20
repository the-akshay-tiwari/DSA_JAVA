package lec12Recurssion;

public class dsa9 {
  //Binary strings problem
  //print all binary strings of size N without consecutive ones.

  public static void binStr(int n,int lastPlace, String str){
    if(n==0){
      System.out.println(str);
      return;
    }

    binStr(n-1, 0, str+"0");
    if(lastPlace==0){
      binStr(n-1, 1, str+"1");
    }

    /*
    //0 on last seat
    if(lastPlace==0){
      binStr(n-1, 0, str.append("0"));
      binStr(n-1, 1, str.append("1"));
    }
    //1 on last seat
    else{
      binStr(n-1, 0, str.append("0"));
    }
    */

  }

  public static void main(String[] args) {
    binStr(4, 0, "");
  }

}
