package lec16Backtracking;

public class dsa2 {
  //find & print all subsets of a given strings
  //TC O(n*2^n)
  //SC O(n)

  public static void subSets(String str,int i,String subStr){
    if(i==str.length()){
      subStr=(subStr=="")?" ":subStr;
      System.out.println(("'"+subStr+"'"));
      return;
    }
    subSets(str, i+1, subStr+str.charAt(i));
    subSets(str, i+1, subStr);
    

  }

  //find & print all permutations of a String 
  public static void permutations(String str,String ans){
    if(str.length()==0){
      System.out.println(ans);
      return;
    }
    for(int i=0;i<str.length();i++){
      char curr = str.charAt(i);
      String newStr=str.substring(0,i)+str.substring(i+1,str.length());
      permutations(newStr, ans+curr);

    }
  }

  public static void main(String[] args) {
    //subSets("abcd", 0, "");
    permutations("abc", "");
  }
  
}
