package lec12Recurssion;

public class dsa7 {

  //remove duplicates
  public static String remDup(String str,int idx,StringBuilder ans,boolean map[]){
    if(idx==str.length())return ans.toString();
    if(map[str.charAt(idx)-'a']==false){
      ans.append(str.charAt(idx));
      map[str.charAt(idx)-'a']=true;
    }
    return remDup(str,idx+1,ans,map);
  }

  public static void main(String[] args) {
    String str="appnnacollege";//ans=>"apncoleg"
    boolean map[]=new boolean[26];
    StringBuilder ans=new StringBuilder("");
    System.out.println(remDup(str, 0, ans, map));
  }
}
