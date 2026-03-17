package lec6Array;

public class Dsa5 {
  public static void main(String[] args) {
    int arr[] = { 2, 4, 6, 8, 10 };

    for(int k=0;k<arr.length;k++){
      for (int i = k; i <arr.length; i++) {
      for (int j = k; j <i+1; j++) {
        System.out.print(arr[j]+",");
      }
      System.out.println();
    }
  }
  }
}
