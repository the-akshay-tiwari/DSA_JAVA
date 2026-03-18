package lec12Recurssion;

public class dsa4 {
  //check if a given array is sorted or not

  public static boolean isSorted(int arr[],int start){
    if(start==arr.length-1)return true;
    if(arr[start]>arr[start+1])return false;
    return isSorted(arr, start+1);
  }

  //WAF to find the first occurance of an element in an array
  public static int firstOccurance(int arr[],int key,int i){
    if(i==arr.length)return -1;
    if(arr[i]==key)return i;
    return firstOccurance(arr, key, i+1);
  }

  public static int lastOccurance(int arr[],int key,int i){
    if(i==-1)return -1;
    if(arr[i]==key)return i;
    return lastOccurance(arr, key, i-1);
  }

  public static void main(String[] args) {
    int arr[]={8,3,6,9,5,10,2,5,3};
    System.out.println(lastOccurance(arr, 5, arr.length-1));
  }
}
