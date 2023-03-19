//Recursion
public class FibonacciSeries {
    //Calculate fibonacci numbers upto n__ har tisre number ka sum pichle 2 numbers ka sum hota hai
    public static int Fibonacci(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        int fibnm1 = Fibonacci(n-1);
        int fibnm2 = Fibonacci(n-2);
        int fibN = fibnm1 + fibnm2;
        return fibN;
        
    }

    public static void main(String args[]) {
        int n = 26;
        System.out.println(Fibonacci(n));
    }
}
