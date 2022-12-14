package array_2D;

import java.util.Scanner;

public class Operation_2D_array {

    public static void input(int[][] arr, Scanner scan) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the elements of the row : " + (i + 1));

            for (int j = 0; j < arr.length; j++) {
                System.out.print("Element - " + i + ", " + j + " : ");
                arr[i][j] = scan.nextInt();
            }
            System.out.println();
        }
    }

// Output a 2D array

    public static void output(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Elements of row : " + (i + 1));

            for (int j = 0; j < arr.length; j++) {
                System.out.print("Element - " + i  + ", " + j  + " : ");
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    }


    //add elements of two matrix

    public static int[][] add(int[][] arr1, int[][] arr2) {
        int[][] arr3 = new int[arr1.length][arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return arr3;
    }

    //multiplication matrix

    public static int[][] multiply(int[][] arr1, int[][] arr2) {
        int[][] arr3 = new int[arr1.length][arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                int sum = 0;
                for (int k = 0; k < arr1.length; k++) {
                    sum += arr1[i][k] * arr2[k][j];
                }
                arr3[i][j] = sum;
            }
        }
        return arr3;
    }

}
