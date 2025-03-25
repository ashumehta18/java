//ROTATE 2D ARRAY BY 90 DEGREES


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt(); 
            int[][] arr = new int[N][N];
            
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = sc.nextInt();
                 }
            } 
            
            int[][] rotated = rotate90Clockwise(arr, N);

            
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(rotated[i][j]);
                    if (j < N - 1) {
                        System.out.print(" "); 
                    }
                }
                System.out.println(); 
            }
            System.out.println(); 
        }
    }

    public static int[][] rotate90Clockwise(int[][] arr, int N) {
        int[][] rotated = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                rotated[j][N - 1 - i] = arr[i][j];
            }
        }

        return rotated;
    }
}
