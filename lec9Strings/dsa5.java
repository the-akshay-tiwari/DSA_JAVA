package lec9Strings;

public class dsa5 {

  public static String subString(String str,int start, int end){
    String subStr="";
    for(int i=start;i<end;i++){
      subStr+=str.charAt(i);
    }
    return subStr;
  }
  public static void main(String[] args) {
    System.out.println(subString("HelloWorld", 1, 5));
  }
}
