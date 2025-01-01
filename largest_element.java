import java.util.*;


public class largest_element{
    public int largest(int arr[],int n ){
        int max = arr[0];
        for(int i = 0;i<n;i++ ){
            if(arr[i]>max){
                max = arr[i];
        }
    }
        return max;
    }
    // public int sl(int arr[],int n){
    //     int max, max2;
    //     for(int i= 0; i<n;i++){
    //         if(arr[i]<max && arr[i])
    //     }
    // }


    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter sizze ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("elements");
        for(int i = 0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        for(int num :arr){
            System.out.print(num + " ");
        }

       largest_element obj = new largest_element();
        int largestElement = obj.largest(arr,n);
        System.out.println("Largest element: " + largestElement);
        //int largestElement = obj.largest(arr);
    }
}