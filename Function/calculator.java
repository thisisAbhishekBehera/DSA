import java.util.*;
//Switch statement
public class calculator {
public static void main(String args[]) {
   System.out.println("Enter a");
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     System.out.println("Enter b");
     int b = sc.nextInt();
     System.out.println("Enter operator");
     char operator = sc.next().charAt(0);


     switch(operator) {
        case '+' : System.out.println(a+b);
                    break;
        case '-' : System.out.println(a-b);
                    break;
        case '*'  : System.out.println(a*b);
                     break;
        case '/'   : System.out.println(a/b);
                     break;
        default : System.out.println("not");

     }
}
   
}