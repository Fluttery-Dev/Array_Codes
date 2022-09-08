import basicArray.Operations_1D_array;

import java.util.Scanner;

public class Code45_L {
    static int mod(int n){
        if( n > 0)
            return n;
        return -1*n;
    }

    static void bubbleSort(int[] arr, int start, int end) {

        if (start == end)
            return;

        for (int i = 0; i < end; i++) {
            if (mod(arr[i]) > mod(arr[i + 1])) {
                int temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
            }
        }
        bubbleSort(arr, start, end - 1);
    }

    public static void main(String[] args){

        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        n = scan.nextInt();
        int[] arr = new int[n];

        Operations_1D_array.input(arr, scan);


        bubbleSort(arr, 0, arr.length-1);

        int[] prefix_sum  = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            prefix_sum[i] = arr[i+1] + arr[i];
        }

        int min = 0;
        for (int i = 0; i < n - 1; i++) {
            if(mod(prefix_sum[min]) > mod(prefix_sum[i]))
                min = i;
        }

        System.out.println("The pairs are : [ " + arr[min] + " " + arr[min+1] + " ]");
        }
}
