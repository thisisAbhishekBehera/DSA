import java.util.ArrayList;

public class Arraylist {
    public static void main(String args[]) {
        //java Collection framework
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        list.add(1,9);
        System.out.println(list);

        //Get operation
        int element = list.get(2);
        System.out.println(element);

        //delete
        list.remove(2);
        System.out.println(list);

        //Set element
        list.set(2, 8);
        System.out.println(list);

        //Contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));


        //Size of ArrayList
        System.out.println(list.size());

    }
}