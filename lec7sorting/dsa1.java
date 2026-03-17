package lec7sorting;

import java.util.*;

public class dsa1 {

  public static void BubbleSort(int arr[]){
    for(int i=0;i<arr.length-1;i++){
      int swap=0;
      for(int j=0;j<arr.length-1-i;j++){
        if(arr[j]>arr[j+1]){
          int temp=arr[j+1];
          arr[j+1]=arr[j];
          arr[j]=temp;
          swap++;
        }
      }
      if(swap==0)
        return;
    }
  }

  public static void Selection(int arr[]){
    for(int i=0;i<arr.length-1;i++){
      int idx=i;
      for(int j=i+1;j<arr.length;j++){
        if(arr[j]<arr[idx]){
            idx=j;
        }
      }
      int temp=arr[i];
      arr[i]=arr[idx];
      arr[idx]=temp;
    }
  }

  public static void insertionSort(int arr[]){
    for(int i=1;i<arr.length;i++){
      int j=i-1;
      int temp=arr[i];
      while(j>=0 && temp<arr[j]){
        arr[j+1]=arr[j];
        j--;
      }
      arr[j+1]=temp;
    }
  }

  public static void countingSort(int arr[]){
    int max=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
      max=arr[i]>max?arr[i]:max;
    }
    int count[]=new int[max+1];
    for(int i=0;i<arr.length;i++){
      count[arr[i]]++;
    }
    int i=0;
    int j=0;
    while(i<count.length){
      if(count[i]==0){
        i++;
      }
      else{
        arr[j++]=i;
        count[i]--;
      }
    }
  }

  public static void main(String[] args) {
    int arr[]={5,4,4,7,7,1,3,2}; //for reverse order....use 'Integer' then array will work as object of Integer class.
    // BubbleSort(arr);

    // Selection(arr);
    
    //insertionSort(arr);

     Arrays.sort(arr); //NlogN time complexity ....array should be of 'Integer' type not 'int' type for reverse order

    // Arrays.sort(arr ,0,3, Collections.reverseOrder());

    countingSort(arr);
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    
  }
}
