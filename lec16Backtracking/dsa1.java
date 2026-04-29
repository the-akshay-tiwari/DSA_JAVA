package lec16Backtracking;

public class dsa1 {
  // basics of recurssion
  // question for understanding of backtracking
  // Q: given an empty array of size 'n';
  // recurssive function jo ith index pr (i+1) store krde
  // return krte time value ko decrease by 2 krna hai

  public static void func(int arr[], int i) {
    if (i == arr.length) {
      return;
    }
    arr[i] = i + 1;
    func(arr, i + 1);
    arr[i] -= 2;
  }

  public static void main(String[] args) {
    int arr[] = new int[5];
    func(arr, 0);
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

}
