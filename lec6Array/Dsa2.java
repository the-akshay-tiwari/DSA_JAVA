package lec6Array;

public class Dsa2 {
  //linear search
  public static int linSearch(int arr[],int key){
    for(int i=0;i<arr.length;i++){
      if(arr[i]==key)return i;
    }
    return -1;
  }

  //binary search
  public static int binSearch(int arr[],int key){
    int st = 0;
    int end = arr.length-1;
    
    while(st<=end){
      int mid = st + (end-st)/2;
      if(key == arr[mid]){
        System.out.println(mid);
        return mid;
      }
      else if(key<arr[mid]){
        end=mid-1;
      }
      else{
        st=mid+1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {

    
    int arr[]={0,1,2,4,6,7,8,9};
    int target=8;

    System.out.println(linSearch(arr,target));
    System.out.println(binSearch(arr,target));
  }
}
