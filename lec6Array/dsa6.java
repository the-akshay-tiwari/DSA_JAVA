package lec6Array;

public class dsa6 {
  //max subarray sum

  public static void main(String[] args){
    int arr[] = {-2,-3,-4,-1,-2,-1,-5,-3};
    int maxSum=Integer.MIN_VALUE;
    int currSum=0;

    // for(int k=0;k<arr.length;k++){
    //   for (int i = k; i <arr.length; i++) {
    //     int currSum=0;
    //     for (int j = k; j <i+1; j++) {
    //       currSum+=arr[j];
    //     }
    //     maxSum=(maxSum>currSum?maxSum:currSum);
    //   }
    // }
    // System.out.println(maxSum); 

    //****Kadanes algorithm*****
    for(int i=0;i<arr.length;i++){
      currSum+=arr[i];
      maxSum=(maxSum>currSum?maxSum:currSum);
      currSum=(currSum<0?0:currSum);
    }
    System.out.println(maxSum);
  }
}
