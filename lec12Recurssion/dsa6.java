package lec12Recurssion;

public class dsa6 {
  // tiling problem
  // Given a "2Xn" board and tiles of size "2X1", count the number of ways to tile the given board using the 2X1 tiles (A tile can either be placed horizontally or vertically.)

  public static int tiling(int n){
    if(n==0 || n==1)return 1;
    return tiling(n-1)+tiling(n-2);
  }

  public static void main(String[] args) {
    System.out.println(tiling(4));
  }

}
