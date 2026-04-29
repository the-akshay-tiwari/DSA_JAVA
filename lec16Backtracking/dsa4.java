package lec16Backtracking;

public class dsa4 {
  // N Queens problem , all possible solutions
  // Place N queens on NxN chess board such that no two queens can attack each
  // other

  public static boolean canPlace(char board[][], int r, int c) {
    // up
    for (int k = 0; k < r; k++) {
      if (board[k][c] == 'Q')
        return false;
    }

    // left diagonal
    for (int i = r - 1, j = c - 1; i >= 0 && j >= 0; i--, j--) {
      if (board[i][j] == 'Q')
        return false;
    }
    // right diagonal
    for (int i = r - 1, j = c + 1; i >= 0 && j < board[0].length; i--, j++) {
      if (board[i][j] == 'Q')
        return false;
    }
    return true;
  }

  public static void NQueen(char board[][], int r) {
    if (r == board.length) {
      print(board);

      return;
    }
    for (int i = 0; i < board.length; i++) {
      if (canPlace(board, r, i)) {
        board[r][i] = 'Q';
        NQueen(board, r + 1);
        board[r][i] = 'X';
      }
    }

  }

  public static void print(char arr[][]) {
    System.out.println("----------CHESS BOARD----------");
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        System.out.print(" " + arr[i][j] + " ");
      }
      System.out.println();
    }
    
  }

  public static void makeBoard(char board[][]){
    for(int i=0;i<board.length;i++){
      for(int j=0;j<board.length;j++){
        board[i][j]='X';
      }
    }
  }

  public static void main(String[] args) {
    int n=4;
    char board[][] =new char[n][n];
    makeBoard(board);
    NQueen(board, 0);

  }

}