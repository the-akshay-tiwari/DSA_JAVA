package lec8Array_2D;

public class dsa4 {
  //search in sorted matrix
  // time complexity= O(n+m)
  public static void search(int mat[][],int key){
    int n=0;
    int m=mat[0].length-1;
    while(n<mat.length && m>=0){
      if(mat[n][m]==key){
        System.out.println("found at ["+n +"]["+m+"]");
        return;
      }
      else if(mat[n][m]<key){
        n++;
      }
      else{
        m--;
      }
    }
    System.out.println("not found");
  }

  public static void main(String[] args) {
    int mat[][]={
      {10,0,30,40},
      {15,25,35,45},
      {27,29,37,48},
      {32,33,39,50}
    };

    search(mat, 33);

  }
  
}
