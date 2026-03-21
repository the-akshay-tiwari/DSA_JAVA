package lec13MergeSort;

public class dsa2 {
  //code from lecture

  //merge sort
  public static void mergeSort(int arr[],int start,int end){
    //base case
    if(start>=end){
      return;
    }
    int mid=start +(end-start)/2;
    mergeSort(arr, start, mid);
    mergeSort(arr, mid+1, end);

    merge(arr,start,mid,end);
  }

  public static void merge(int arr[],int start,int mid ,int end){
    int tempArr[]=new int[end-start+1];
    int i=start;
    int j=mid+1;
    int k=0;

    while(i<=mid && j<=end){
      if(arr[i]<arr[j]){
        tempArr[k++]=arr[i++];
      }
      else{
        tempArr[k++]=arr[j++];
      }
    }

    while(i<=mid){
      tempArr[k++]=arr[i++];
    }
    while(j<=end){
      tempArr[k++]=arr[j++];
    }

    //copy to main arr;
    for(i=start,k=0;k<tempArr.length;i++,k++){
      arr[i]=tempArr[k];
    }

  }


  public static void main(String[] args) {
    int arr[]={2,5,4,6,2,3,1,5};
    mergeSort(arr, 0, arr.length-1);
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }
}
