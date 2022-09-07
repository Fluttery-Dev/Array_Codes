import basicArray.Operations_1D_array;

import java.util.Scanner;

public class Code39_L {
    public static void main(String[] args){

        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        n = scan.nextInt();
        int[] arr = new int[n];

        Operations_1D_array.input(arr, scan);

        System.out.println("How many times you want to rotate : ");
        n = scan.nextInt();

        Operations_1D_array.output(arr);

        System.out.printf("From %dth position the values of the array are : ", n);
        for (int i = n; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }

        System.out.printf("\nBefore %dth position the values of the array are : ", n);
        for (int i = 0; i < n; i++) {
                System.out.print(" "+arr[i]);
        }

        System.out.println("\nAfter rotating from 4th position the array is: ");
        for (int i = 0; i < n; i++) {
            Operations_1D_array.rotate(arr);
        }

        Operations_1D_array.output(arr);

    }
}
