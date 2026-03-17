package lec8Array_2D;

import java.util.Scanner;

public class Dsa1 {
  public static void main(String[] args) {
    int arr[][] = new int[3][3];
    int n=3;//can also write arr.length
    int m=3; //can also write arr[0].length

    Scanner sc = new Scanner(System.in);

    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        arr[i][j]=sc.nextInt();
      }
    }
    sc.close();
    
    //output
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
  }
}
