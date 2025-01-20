mport java.util.*;
public class input{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("lucky no. enter");
        int num=sc.nextInt(); //integer input
        System.out.println("lucky no. =" + num);

        System.out.println("enter name ");
        String str= sc.next();
        System.out.println("name is " + str); 
        
        System.out.println("enter sentence ");
        sc.nextLine();
        String read = sc.nextLine();
        System.out.println("sentence is : " + read); 
    }
}
