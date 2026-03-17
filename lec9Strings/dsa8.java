package lec9Strings;

public class dsa8 {
  // string compression 

  public static String strCompress(String str){
    str+=" "; 
    StringBuilder sb= new StringBuilder("");
 
    for(int i=0;i<str.length()-1;i++){
      int count=1;
      sb.append(str.charAt(i));
      while(str.charAt(i)==str.charAt(i+1)){
        count++;
        i++;
      }

      if(count>1){
        sb.append(count);
      }
    }
    return sb.toString();
  }  

  public static void main(String[] args) {
    System.out.println(strCompress("aaabbcccdd"));
  }

}
