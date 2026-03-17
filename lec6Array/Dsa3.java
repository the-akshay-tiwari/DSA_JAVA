package lec6Array;

public class Dsa3 {

  // reverse an array
  public static void revArr(int arr[]){
    int i=0;
    int j=arr.length-1;
    while(i<j){
      /*
        a=a+b;
        b=a-b;
        a=a-b;
      */
      int temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
      i++;
      j--;
    }
    
  }
  public static void main(String[] args) {
    int arr[] = {2,4,6,8,10};
    revArr(arr);
    for(int k=0;k<arr.length;k++){
      System.out.print(arr[k] + " ");
    }
  }
}
