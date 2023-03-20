public class Recursion {
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
    //cheak if array is sorted or not
    public static boolean isSorted(int arr[], int i) {
        if(i == arr.length-1) {
            return true;
        }
        if(arr[i] > arr[i+1]) {
            return false;
        }

        return isSorted(arr, i+1);
    }

    //Find first occurence of a key in an array
    public static int firstOccurence(int arr[],int key,int i) {
        if(i == arr.length) {
            return -1;
        }
        if(arr[i] == key) {
            return i;
        }

        return firstOccurence(arr, key, i+1);
    }
    //Find last Occurence of a key in an Array
    public static int lastOccurence(int arr[],int key,int i) {
        if(i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }
     //Print x to the power n
     public static int Power(int x, int n) {
        if(n == 0) {
            return 1;
        }
        int xnm1 = Power(x, n-1);
        int xn = x * xnm1;
        return xn;
        // or return x * power(x , n-1);
    }

    //Power Optimized
    public static int optimizedPower(int a,int n) {
        if(n == 0) {
            return 1;
        }
        // n is even
        int halfPower = optimizedPower(a, n/2);
       int  halfPowersq = halfPower * halfPower;
       //n is odd
       if(n%2 != 0) {
         halfPowersq = a * halfPowersq;
       }
       return halfPowersq;
    }

    // Tiling problem (In how many ways we can arrange tiles in a floor)
    public  static int tilingProblem(int n) { // 2 x n (Floor size)
             //base case
             if (n == 0 || n == 1) {
                return 1;
            }
            //kaam
            //vertical choice
            int fnm1 = tilingProblem(n-1);

            //Horizontal choice
            int fnm2 = tilingProblem(n-2);

            int totWays = fnm1 + fnm2;
            return totWays;
    }

    //Remove Duplicates from a string
   // public static void removeDuplicates(String str,int idx,StringBuilder newStr,boolean map[]) {
       //     System.out.println(newStr);
           // return;
       // }

        //kaam
        //char currChar = str.charAt(idx);
      //  if(map[currChar-'a'] == true) {
            //duplicate
      //      removeDuplicates(str, idx+1, newStr, map);
      //  } else {
       //     map[currChar - 'a'] = true;
       //       removeDuplicates(str, idx+1, newStr.append(currChar), map);
     //   }
   // }

    public static int friendsPairing(int n) {
        if(n == 1 || n == 2) {
            return n;
        }
        //choice
        //single
        int fnm1 = friendsPairing(n-1);

        //pair
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1) * fnm2;
        //totWays
        int totWays = fnm1 + pairWays;
        return totWays;
           //Compact code
        //return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }

    //print Binary String
    public static void printBinaryStrings(int n,int lastPlace,String str) {
              //Base case
              if(n==0) {
                System.out.println(str);
                return ;
              }
        //kaam
        printBinaryStrings(n-1, 0, str += "0");
        if(lastPlace == 0) {
           printBinaryStrings(n-1, 1, str += "1");
        }
    }


    public static void main(String args[]) {
       // int n = 26;
       // System.out.println(Fibonacci(n));
      // int arr[] = {8,3,6,9,5,10,2,5,3};
      //String str = "appnnacollege";
      //removeDuplicates(str, 0, new StringBuilder(""), new boolean[26] );
      // System.out.println(friendsPairing(3));
      printBinaryStrings(3, 0,str );
    }
}
