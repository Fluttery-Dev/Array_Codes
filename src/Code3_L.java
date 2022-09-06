import basicArray.Operations_1D_array;

import java.util.Scanner;

public class Code3_L {

    static int sumAll(int[] arr){
        int sum = 0;
        for (int x : arr){
            sum += x;
        }

        return sum;
    }
    public static void main(String[] args){

        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        n = scan.nextInt();
        int[] arr = new int[n];

        Operations_1D_array.input(arr, scan);

        int sum = sumAll(arr);

        System.out.println("The Sum of all array elements is : " + sum);

    }

}
