import array_2D.Operation_2D_array;

import java.util.Scanner;

public class Code21_L {

    public static void main(String[] args) {

        int m, n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no of rows : ");
        m = scan.nextInt();
        System.out.println("Enter the no of columns : ");
        n = scan.nextInt();

        int[][] arr1 = new int[m][n];
        Operation_2D_array.input(arr1, scan);

        int[][] arr2 = new int[m][n];
        Operation_2D_array.input(arr2, scan);

        int[][] arr = Operation_2D_array.multiply(arr1, arr2);

        System.out.println("The First matrix is : ");
        Operation_2D_array.output(arr1);
        System.out.println("The Second matrix is : ");
        Operation_2D_array.output(arr2);

        System.out.println("The Product of two matrix is : ");
        Operation_2D_array.output(arr);

    }
}
