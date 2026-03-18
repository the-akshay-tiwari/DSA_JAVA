package lec12Recurssion;

public class dsa8 {

  //friend's pairing problem 
  //given n friends, each one can remain single or can be paired up with some other friend. each friend can be paired only once. find out the total number of ways in which friends can remain single or can be paired up.

  public static int pairs(int n){
    if(n==1)return 1;
    if(n==2)return 2;
    return pairs(n-1)+((n-1)*pairs(n-2));
  }

  public static void main(String[] args) {
    System.out.println(pairs(3));
  }
}
