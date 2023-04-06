import java.util.*;

public class Even_odd_Bitman {
    public static void OddEven(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }

    public static void main (String args[]) {
        OddEven(3);
        OddEven(6);
    }
}