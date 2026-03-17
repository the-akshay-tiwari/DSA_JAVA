package lec9Strings;

public class dsa4 {

  //strings compare

  public static void main(String[] args) {
    String s1 = "yoyo";
    String s2="yoyo";
    String s3 = new String("yoyo");

    //dont use -:
    //s1==s2;
    //s1==s3;

    //use-:
    s1.equals(s2);
    s1.equals(s3);
  }
  
}
