import array_2D.Operation_2D_array;

import java.util.Scanner;

public class Code31_L {

    public static void main(String[] args) {

        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no of rows : ");
        n = scan.nextInt();

        int[][] arr = new int[n][n];
        Operation_2D_array.input(arr, scan);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==j) {
                    if (arr[i][j] != 1) {
                        System.out.println("This is not an Identity Matrix ");
                        return;
                    }
                }
                else {
                    if (arr[i][j] != 0){
                        System.out.println("This is not an Identity Matrix ");
                        return;
                    }
                }
            }

        }

        System.out.println("This is an Identity Matrix ");

    }
}