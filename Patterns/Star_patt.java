import  java.util.*;

public class Star_patt {
    public static void Star_patt(int n) {
        for(int i = 1; i<=n ;i++) {
           for(int j = 1;j<=i;j++) {
            System.out.print("*");
           }
           System.out.println() ;  
        }
    }

    public static void main(String args[]) {
        Star_patt(5);
    }

    
}