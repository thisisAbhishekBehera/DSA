import java.util.*;

public class Inverted_Starpatt {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
     int n =sc.nextInt();

     for(int i = 1;i<=n;i++) {
        for(int star = 1; star<=n-i+1; star++) {
            System.out.print("*");
          }
          System.out.println();
      }

    
   
  }
}
