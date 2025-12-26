//using function  return true for even and false for odd

// Time Complexity: O(1) - Single modulo operation
// Space Complexity: O(1) - Only constant extra space used
import java.util.*;
public class odd_even{
    public boolean check(int n){
        if(n% 2 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter ");
        int num = scanner.nextInt();

        odd_even obj = new odd_even();
        boolean v = obj.check(num);
        System.out.println(v);
    }
}
