import basicArray.Operations_1D_array;

import java.util.Scanner;

public class Code37_L {
    public static void main(String[] args){

        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        n = scan.nextInt();
        int[] arr = new int[n];

        Operations_1D_array.input(arr, scan);

        int start = 0;
        int end = n - 1;

        while(start <= end){
            int mid = (end-start)/2 + start;
            int pivot = arr[mid];
            if( pivot < arr[mid-1] && pivot < arr[mid+1]){
                System.out.print("The pivot element in the array is :  " + pivot);
                return;
            }
            else if (pivot > arr[mid-1]) {
                start = mid + 1;
            }
            else if (pivot > arr[mid+1]) {
                end = mid-1;
            }
        }

        System.out.println("There is no pivot element int he array");
    }
}
