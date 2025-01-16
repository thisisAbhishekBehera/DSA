import java.util.*;

public class Strings {
    public static void printLetters(String str) {
        for(int i = 0; i<str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }

    public static void main(String args[]) {
        String firstName = "Abhishek";
        String lastName = "Abhijita";
        String fullName = firstName + "  <3  " +  lastName;
        printLetters(fullName);
        
    }
}
