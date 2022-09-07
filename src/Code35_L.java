import basicArray.Operations_1D_array;

import java.util.Scanner;

public class Code35_L {

    public static void main(String[] args){

        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        n = scan.nextInt();
        int[] arr = new int[n];

        Operations_1D_array.input(arr, scan);

        int max_till_now = Integer.MIN_VALUE;
        int sum = 0;

        for (int x:arr) {
            sum += x;

            if(sum > max_till_now )
                max_till_now = sum;

            if(sum < 0){
                sum = 0;
            }
        }

        System.out.println("Max Sum of the contigous array is : " + max_till_now);

    }
}
