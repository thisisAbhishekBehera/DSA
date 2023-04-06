import java.util.*;

public class Trapping_rainWater {
      public static int Trapped_RainWater(int height[]) {
        int n = height.length;
           //calculate left max boundary - Array
           int leftMax[] = new int[n];
           leftMax[0] = height[0];
           for(int i = 1; i<n;i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
           }

           // calculate right max boundary - Array
            int rightMax[] = new int[n];
            rightMax[n-1] = height[n-1];
            for(int i= n-2;i>=0;i-- ) {
                rightMax[i] = Math.max(height[i] , rightMax[i+1]);
            }
              int trappedWater = 0;
            //loop
            for(int i = 0;i<n;i++) {
                int waterLevel = Math.min(leftMax[i] , rightMax[i]);
                trappedWater += waterLevel - height[i]; 
            }

              return trappedWater;


    }

    public static void main(String args[]) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println("Trapped water is : " +Trapped_RainWater(height));  
    }
}