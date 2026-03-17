package lec6Array;

// import java.util.*;

public class Dsa1 {
  public static void main(String[] args) {
    //int arr[]=new int[10];as d
    int arr[]={5,6,9,7,5,2,1,4};

    int max= Integer.MIN_VALUE;

    for(int i=0;i<arr.length;i++){
      if(arr[i]>max){
        max=arr[i];
      }
    } 
    System.out.println("Max = "+max);

  }
}
