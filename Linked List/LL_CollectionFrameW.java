import java.util.LinkedList;

public class LL_CollectionFrameW {
    public static void main(String args[]) {
        //create   ->  Integer  Float  Character 
         LinkedList<Integer> ll = new LinkedList<>();

        // Add
          ll.addLast(1);
          ll.addLast(2);
          ll.addLast(3);
          ll.addFirst(0);
        //   0>1>2
        System.out.println(ll);

        // Remove

        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}