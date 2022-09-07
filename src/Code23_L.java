import array_2D.Operation_2D_array;

import java.util.Scanner;

public class Code23_L {
    public static void main(String[] args) {

        int m, n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no of rows : ");
        m = scan.nextInt();
        System.out.println("Enter the no of columns : ");
        n = scan.nextInt();

        int[][] arr = new int[m][n];
        Operation_2D_array.input(arr, scan);

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }

        System.out.println("The sum of the right diagonal elements is : " +  sum);

    }
}
