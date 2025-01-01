import java.util.Scanner;

public class palindrome{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("number: ");
        int n = scanner.nextInt();
        
        // Store the original number
        int o = n;
        int r = 0;

        while (n != 0) {
            int lastd = n % 10; 
            r = r * 10 + lastd; 
            n /= 10; /
        }
        System.out.println(r);
        if (o == r) {
            System.out.println(o + " is a palindrome.");
        } else {
            System.out.println(o + " is not a palindrome.");
        }
    }
}