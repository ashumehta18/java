// recursion concept  lec 1

// Time Complexity: O(1) - Fixed number of function calls (4 calls)
// Space Complexity: O(1) - Fixed call stack depth (4 frames)
import java.util.*;

public class message {
    public static int m() {
        System.out.println(1);
        return m1();
    }
    
    public static int m1() {
        System.out.println(2);
        return m2();
    }
    
    public static int m2() {
        System.out.println(3);
        return m3();
    }
    
    public static int m3() {
        return 4;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = m();
        System.out.println(s);
    }
}
