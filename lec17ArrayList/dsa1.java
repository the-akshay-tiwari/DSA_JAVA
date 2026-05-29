package lec17ArrayList;

import java.util.ArrayList;

public class dsa1 {
  
  public static void main(String[] args) {
    
    //array list
    ArrayList<Integer> list =new ArrayList<>();
    //add element
    list.add(10); 
    list.add(20);
    list.add(40);
    list.add(50);

    //we can also add element at particular idx
    list.add(2,30);

    //get element
    //System.out.println(list.get(0));
    
    //remove element
    //list.remove(2);

    //set element at index
    //list.set(2, 30);

    //contains ele, it checks weather the element is present or not
    //System.out.println(list.contains(1));

    //.size()
    // System.out.println(list.size());

    //loops on array list
    // for(int i=0;i<list.size();i++){
    //   System.out.println(list.get(i));
    // }

    // System.out.println(list);


    //print reverse of array list
    // for(int i=list.size()-1;i>=0;i--){
    //   System.out.println(list.get(i));
    // }

  }

}
