package lec4Patterns;

public class dsa1 {
  public static void LBtri(int n,char ch){
    for(int i=0;i<n;i++){
      for(int j=0;j<=i;j++){
        System.out.print(ch);
      }
      System.out.println();
    }
  }

  public static void LUtri(int n,char ch){
    for(int i=0;i<n;i++){
      for(int j=i;j<n;j++){
        System.out.print(ch);
      }
      System.out.println();
    }
  }

  


  public static void main(String[] args) {
    LUtri(4,'*');
    LBtri(4,'*');
  }
}
