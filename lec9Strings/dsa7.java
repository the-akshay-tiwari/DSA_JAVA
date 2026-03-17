package lec9Strings;

//import java.util.*;

public class dsa7 {
  // string builder

  //Q4. for a given String convert the first letter of each word to uppercase.

  public static String toUpperCase(String str){
    StringBuilder sb = new StringBuilder("");

    char ch=Character.toUpperCase(str.charAt(0));
    sb.append(ch);

    for(int i=1;i<str.length();i++){
      if(str.charAt(i-1)==' '){
        ch=Character.toUpperCase(str.charAt(i));
        sb.append(ch);
      }
      else{
        sb.append(str.charAt(i));
      }
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    // StringBuilder sb=new StringBuilder("hello");  
    //they are mutable 
    
    String str=new String("hi, i am akshay");
    
    System.out.println(toUpperCase(str));
     
  }
}
