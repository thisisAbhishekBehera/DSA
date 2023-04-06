import java.util.*;

public class Evensum_Oddsum{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    
    int number;
    int choice;
    int evensum = 0;
    int oddsum = 0;

    do {
      System.out.print("Enter a number : ");
      number = sc.nextInt();


      if (number % 2 == 0) {
        evensum += number;
      } else {
        oddsum += number;
      }

      System.out.print("Do you want to continue? Press 1 for yes or 0 for no");
      choice = sc.nextInt();
    } 
    while(choice == 1);
    System.out.println("Sum of even numbers: " + evensum);
    System.out.println("Sum of odd numbers : " + oddsum);
   
  }
}
