import java.util.*;

public class BitManipulation2 {
    public static void oddOrEven(int n) {// Even odd
        int bitMask = 1;
        if((n & bitMask) == 0) {
            //Even number
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }

    public static int getithBit(int n, int i) {
        int bitMask = 1<<i;
        if((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setithBit(int n,int i) {
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static int clearithBit(int n,int i) {
        int bitMask = ~(1<<i);
        return n & bitMask ;
    }

    public static int updateithBit(int n, int i, int newBit) {// 1st method
        if(newBit == 0) {
          return   clearithBit(n, i);
        } else {
           return setithBit(n, i);
        }
    } // both methods have same time complexity
    public static int updateithBit_2(int n,int i,int newBit) { // 2nd method
           n = clearithBit(n, i);
           int bitMask = newBit<<i;
           return n |bitMask;
    }

    public static int Clear_i_Bits(int n,int i) {
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    public static int clearaRangeofBits(int n,int i,int j) {
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static boolean isPowerofTwo(int n) {
        return (n & (n-1)) == 0;
    }

    public static int countSetBits(int n) {
        int count = 0;
        while(n > 0) {
            if((n & 1) == 0) { //check our LSB
                 count++;                            
            } 
            n = n>>1;
        }
        return count;
    }

    public static int fastExpo(int a,int n) {
        int ans = 1;

        while(n > 0) {
            if((n & 1) != 0) { //check LSB
                ans = ans * a;
            }
            a = a * a;
            n = n>>1;
        }

        return ans;
    }
    public static void main(String args[]) {
     System.out.println(fastExpo(3, 5));
    }
}
