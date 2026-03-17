package lec9Strings;

public class dsa3 {
  //given a route containg 4 directions(E,W,N,S), find the shortest path to reach destination

  public static double distCal(String route){
    int x=0,y=0;
    double dist;
    for(int i=0;i<route.length();i++){
      switch(route.charAt(i)){
        case 'W' : x--;break;
        case 'E' : x++;break;
        case 'N' : y++;break;
        case 'S' : y--;
      }
    }

    dist=Math.sqrt((x*x)+(y*y));

    return dist;
  }

  public static void main(String[] args) {
    
    String route="WNEENESENNN";
    System.out.println(distCal((route)));

  }
  
}
