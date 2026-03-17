package lec9Strings;

public class dsa6 {
  //compare and return largest string lexographically

  public static String largestStr(String arr[]){
    String largest=arr[0];

    for(int i=1;i<arr.length;i++){
      largest=arr[i].compareToIgnoreCase(largest)<0?largest:arr[i];
    }

    return largest;
  }

  public static void main(String[] args) {
    String fruits[]={"apple","mango","banana"};

    System.out.println(largestStr(fruits));
  }

  
}
