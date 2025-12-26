import java.util.*;

// Time Complexity: O(log n) - Using Math.log10 for digit counting
// Space Complexity: O(1) - Only constant extra space used
public class count_digit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. ");
        int num= sc.nextInt();
        int count =0;
        // while(num >0){
        //     num = num/10;
        //     count++;
        // }
        count = (int) (Math.log10(num) + 1);
        System.out.println("count is " + count);
    }
}
 