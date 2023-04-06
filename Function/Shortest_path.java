import java.util.*;

public class Shortest_path {
    public static float shortestPath(String path) {
        int x = 0;
        int y = 0;

        for(int i = 0;i<path.length(); i++) {
            char dir = path.charAt(i);
            //south
            if(dir == 'S') {
                y--;
            }
            //north
            else if(dir == 'N') {
                y++;
            }
            //west
            else if(dir == 'W') {
                x--;
            }
            //east
            else  {
                x++;
            }
        }

         int X2 = x*x;
         int Y2 = y*y;
         return(float)Math.sqrt(X2 + Y2);
    }
    public static String substng(String str , int si,int ei) {
        String substr = "";
        for (int i = si;i<ei;i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main (String args[]) {
        String str = "HelloWorld";
        System.out.println(str.substring(0,5));
    }
}