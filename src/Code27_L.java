import array_2D.Operation_2D_array;

import java.util.Scanner;

public class Code27_L {

    public static void main(String[] args) {

        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no of rows : ");
        n = scan.nextInt();

        int[][] arr = new int[n][n];
        Operation_2D_array.input(arr, scan);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                arr[i][j] = 0;
            }
        }

        Operation_2D_array.output(arr);
    }
}