package lec16Backtracking;

public class dsa6 {
  //Q: Grid ways
  // Find number of ways to reach from (0,0) two (N-1,M-1) in NxM grid. Allowed moves - right or down.

  static int count=0;

  public static void gridWays(int grid[][],int i,int j){
    if(i==grid.length || j==grid[0].length){
      return;
    }
    if(i==grid.length-1 && j==grid[0].length-1){
      count++;
      return;
    }

    gridWays(grid, i, j+1);
    gridWays(grid,i+1,j);
  }

  public static void main(String[] args) {
    int n=3;
    int m=3;
    int grid[][]=new int[n][m];
    gridWays(grid, 0, 0);
    System.out.println(count);
  }

}
