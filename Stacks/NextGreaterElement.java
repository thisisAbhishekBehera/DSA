import java.util.*;
//next greater in the right side :- loop to start from the right end

//to find next greater in the left side loop to start from the left side
public class NextGreaterElement {
    
    public static void main(String args[]) {
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];

        for(int i=arr.length-1; i>=0;i--) {
            //while loop
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            //if else
            if(s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[s.peek()];
            }

            //push in s
            s.push(i);
        }

        for(int i=0; i<nextGreater.length; i++) {
            System.out.print(nextGreater[i] + " ");
        }

        System.out.println();
    }
}
