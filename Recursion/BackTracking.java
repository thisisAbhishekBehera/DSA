public class BackTracking {
    //Backtracking in Array
    public static void changeArr(int arr[], int i, int val) {
         //basecase
           if(i == arr.length) {
            printArr(arr);
            return;
           }

         //recursion
         arr[i] = val;
         changeArr(arr,i+1,val+1);//fxn call step
         arr[i] = arr[i] - 2;//Backtracking step
    }

    public static void printArr(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //Find subsets of a string
    public static void findSubsets(String str,String ans,int i) {
        //Base case 
        if(i == str.length()) {
           // if(ans.length() == 0) {
           // System.out.println("null");  to display there is exist a empty space
              
            //} else {
                System.out.println(ans);
            
           // }
            return ;
        }

        //Yes choice
        findSubsets(str, ans+str.charAt(i), i+1);
        //No choice
        findSubsets(str, ans, i+1);
    }
       //Find permutation of a String
       public static void findPermutation(String str,String ans) {
           //Base case
           if(str.length() == 0) {
            System.out.println(ans);
            return;
           }

           //recursion
           for(int i=0;i<str.length();i++) {
            char curr = str.charAt(i);
            //"abcde" => "ab" + "de" = "abde"
            String  Newstr = str.substring(0, i) + str.substring(i+1);
            findPermutation(Newstr, ans+curr);
           }
        }


    public static void main(String args[]) {
        //int arr[] = new int [5];
       // changeArr(arr, 0, 1);
       // printArr(arr);
       String str = "abc";
       //findSubsets(str, "", 0);
       findPermutation(str, " ");

    }
}
