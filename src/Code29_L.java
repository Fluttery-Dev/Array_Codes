import array_2D.Operation_2D_array;

import java.util.Scanner;

public class Code29_L {

    public static void main(String[] args) {

        int m, n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no of rows : ");
        m = scan.nextInt();
        System.out.println("Enter the no of columns : ");
        n = scan.nextInt();

        int[][] arr = new int[m][n];
        Operation_2D_array.input(arr, scan);

        int count = 0;

        for (int[] row : arr) {
            for (int x : row) {
                if (x == 0)
                    count++;
            }
        }

        if (count > m * n / 2) {
            System.out.println("The given matrix is a sparse matrix");
            System.out.println("It has " + count + " no of zeros");
        }
    }
}
