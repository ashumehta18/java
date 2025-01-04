import java.util.*;

public class swap{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        //using XOR function
        n = n^m;
        m = m^n;
        n = n^m;
        System.out.println(n + " and " + m);
    }
}
