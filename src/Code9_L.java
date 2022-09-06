import basicArray.Operations_1D_array;

import java.util.Scanner;

public class Code9_L {
    public static void main(String[] args){

        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        n = scan.nextInt();
        int[] arr = new int[n];

        Operations_1D_array.input(arr, scan);

        System.out.println("The Max element in this array is : " + Operations_1D_array.max(arr));
        System.out.println("The Min element in this array is : " + Operations_1D_array.min(arr));

    }
}
