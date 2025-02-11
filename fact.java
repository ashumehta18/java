 // checked factorial of a no. calculate
import java.util.*;
public class factorial {
    public static int fact(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(fact(n));
    }
} 


