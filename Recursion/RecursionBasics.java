public class RecursionBasics {
    public static void printDecreasing(int n) {
        if(n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDecreasing(n-1);
    }

    public static void printIncreasing(int n) {
        if(n == 1) {
            System.out.print(n + " ");
            return;
        }
        printIncreasing(n-1);
        System.out.print(n + " ");
        
        
    }

    public static Integer Factorial(int n) {
        if(n == 0) {
            return 1;
        }
        int factnm1 = Factorial(n-1);
        int fact = n * Factorial(n-1);
        return fact;
    }

    public static int CalculateSum(int n) {
        if(n == 1) {
            return 1;
        }
        int nm1Sum = CalculateSum(n-1);
        int sum = n + nm1Sum;
        return sum;
    }

    public static void main(String args[]) {
        int n = 15;
        System.out.println(CalculateSum(n));
    }
}
