
import basicArray.Operations_1D_array;

import java.util.Scanner;

public class Code51_L {

    public static void main(String[] args){

        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        n = scan.nextInt();
        int[] arr = new int[n];

        Operations_1D_array.input(arr, scan);

        int max_till_now = Integer.MIN_VALUE;
        int sum_till_now = 0;

        int i =0, j =0;
        while(i< arr.length){

            sum_till_now += arr[j];

            if(sum_till_now > max_till_now){
                max_till_now = sum_till_now;
            }

            if(sum_till_now < 0){
                i = j+1;
                sum_till_now = 0;
            }
            j++;
            if(j == arr.length){
                j = 0;
            }

            if(i==j && sum_till_now != 0)
                break;
        }

        System.out.println("Max Sum of the contigous array is : " + max_till_now);

    }
}
