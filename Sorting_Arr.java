import java.util.Arrays;

public class Sorting_Arr {
    public static void printArr(int arr[]) {
        for(int i = 0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[]) {
        int arr[] = {5,4,1,2,3,9,7};
        Arrays.sort(arr,0,4);
        printArr(arr);
    }
}