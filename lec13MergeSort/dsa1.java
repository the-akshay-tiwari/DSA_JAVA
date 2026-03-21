package lec13MergeSort;

public class dsa1 {
  // code by self.....

  // merge sort
  // based on divide & conquer algorithm

  // function for merge sort
  public static int[] mergeSort(int arr[], int st, int end) {
    // if(end==st){
    // return arr;
    if (st == end) {
      return new int[] { arr[st] };
    }
    int mid = st + (end - st) / 2;
    return merge(mergeSort(arr, st, mid),
        mergeSort(arr, mid + 1, end));

  }

  // merge function
  public static int[] merge(int arr1[], int arr2[]) {
    int mergedArr[] = new int[arr1.length + arr2.length];
    int i = 0, j = 0, k = 0;
    while (i < arr1.length && j < arr2.length) {
      if (arr1[i] < arr2[j]) {
        mergedArr[k++] = arr1[i++];
      } else {
        mergedArr[k++] = arr2[j++];
      }
    }

    while (i < arr1.length) {
      mergedArr[k++] = arr1[i++];
    }
    while (j < arr2.length) {
      mergedArr[k++] = arr2[j++];
    }

    return mergedArr;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 5, 4, 6, 2, 3, 1, 5 };
    int sortedArr[] = mergeSort(arr, 0, arr.length - 1);
    for (int i = 0; i < sortedArr.length; i++) {
      System.out.println(sortedArr[i]);
    }
  }

}
