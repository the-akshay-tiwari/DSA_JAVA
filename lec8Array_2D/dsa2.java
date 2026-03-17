package lec8Array_2D;

public class dsa2 {

  public static void printSpiral(int mat[][]){
    int stRow=0;
    int stCol=0;
    int endRow=mat.length-1;
    int endCol=mat[0].length-1;

    while(stRow<=endRow && stCol<=endCol){
      //top
      for(int j=stCol;j<=endCol;j++){
        System.out.print(mat[stRow][j] + " ");
      }
      //right
      for(int j=stRow+1;j<=endRow;j++){
        System.out.print(mat[j][endCol] + " ");
      }
      //bottom
      for(int j=endCol-1;j>=stCol;j--){
        System.out.print(mat[endRow][j] + " ");
      }

      for(int j=endRow-1;j>stRow;j--){
        System.out.print(mat[j][stCol] + " ");
      }
      stRow++;
      stCol++;
      endRow--;
      endCol--;
    }
  }
  public static void main(String[] args) {
    //spiral matrix

    int mat[][]={
      {1,2,3},
      {12,14,5},
      {16,15,6}
    };

    printSpiral(mat);

  }
}
