package lec6Array;

public class dsa7 {
  //trapping rainwater problem
  public static void main(String[] args) {
    int height[]={4,2,0,6,3,2,5};
    int leftMax[]=new int[height.length];
    int rightMax[]=new int[height.length];
    leftMax[0]=height[0];
    rightMax[height.length-1]=height[height.length-1];
    for(int i=1;i<height.length;i++){
      leftMax[i]=Math.max(leftMax[i-1],height[i]); 
    }
    for(int i=height.length-2;i>=0;i--){
      rightMax[i]=Math.max(rightMax[i+1],height[i]); 
    }

    // for(int i=0;i<leftMax.length;i++){
    //   System.out.print(leftMax[i]);
    // }
    // System.out.println();
    // for(int i=0;i<rightMax.length;i++){
    //   System.out.print(rightMax[i]);
    // }

    int water=0;

    for(int i=1;i<height.length-1;i++){
      int currWater=Math.min(leftMax[i],rightMax[i])-height[i];

      water+=currWater;
    }

    System.out.println(water);

  }
  

}
