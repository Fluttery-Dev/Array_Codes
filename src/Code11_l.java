import basicArray.Operations_1D_array;

import java.util.Scanner;

public class Code11_l {
    public static void main(String[] args){

        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        n = scan.nextInt();
        int[] arr = new int[n];

        Operations_1D_array.input(arr, scan);

        Operations_1D_array.sort(arr);

        Operations_1D_array.output(arr);

    }
}
