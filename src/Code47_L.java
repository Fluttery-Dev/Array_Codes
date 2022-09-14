
import basicArray.Operations_1D_array;

import java.util.Scanner;
import java.util.Vector;

// Subarray with a given sum
public class Code47_L {

    public static void main(String[] args){

        Vector<Pair> pairs = new Vector<Pair>(2);

        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        n = scan.nextInt();
        int[] arr = new int[n];

        Operations_1D_array.input(arr, scan);

        System.out.println("Enter the sum : ");
        int sum = scan.nextInt();


        for (int i = 0; i < arr.length; i++) {
            int sum_till_now = 0;
            for (int j = i; j < arr.length; j++) {
                sum_till_now+=arr[j];
                if(sum_till_now == sum){
                    pairs.addElement(new Pair(i, j+1));
                }
            }
        }

        for (Pair  pair:pairs) {
            System.out.println("The subarray is : ");
            for (int k = pair.start; k < pair.end; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
}
private static class Pair{
        int start = 0;
        int end = 0;

        public Pair(int start, int end){
            this.start = start;
            this.end = end;
        }
    }
}
