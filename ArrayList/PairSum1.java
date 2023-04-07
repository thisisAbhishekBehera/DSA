import java.util.ArrayList;

public class PairSum1 {
    

    //brute force
    public static boolean pairSum(ArrayList<Integer> list, int target) {
           

        for(int i=0;i<list.size(); i++) {
            for(int j=i+1; j<list.size(); j++) {
                if(list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }

        return false;
    }

    //2 pointer method :tc linear
    public static boolean pairSum_2Pointer(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size()-1;

        while(lp != rp) {
            //case1
            if(list.get(lp) + list.get(rp) == target) {
                return true;
            } 
          //case 2
              if (list.get(lp) + list.get(rp) < target) {
                lp++;
            } else {
                //case 3
                rp--;
            }
        }

        return false;
    }


    public static void  main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        //123456
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 10;
        System.out.println(pairSum_2Pointer(list, target));
    }
}
