import basicArray.Operations_1D_array;

import java.util.Scanner;

public class Code19_L {
    public static void main(String[] args){

        int m,n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no of rows : ");
        m = scan.nextInt();
        System.out.println("Enter the no of columns : ");
        n = scan.nextInt();
        int[][] arr = new int[m][n];

        Operations_1D_array.input(arr, scan);




    }
}
