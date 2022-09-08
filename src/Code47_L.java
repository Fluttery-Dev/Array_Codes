//Program is not working correctly, problem with -ve numbers

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

        int i = 0;
        int j = 0;
        int sum_till_now = 0;

        Vector<Pair> negative_pairs = new Vector<Pair>(0);

        while(j <= arr.length){

            if(sum_till_now > sum){
                sum_till_now -= arr[i];
                i++;
            }
            else if(sum_till_now == sum){
                pairs.addElement(new Pair(i,j));
                if(j < arr.length) {
                    sum_till_now += arr[j];
                    if(arr[j] < 0)
                        negative_pairs.addElement(new Pair(j,sum_till_now));
                }
                j++;
            }
            else if(sum_till_now < sum){
                if(negative_pairs.isEmpty()) {
                    if(j < arr.length) {
                        sum_till_now += arr[j];
                        if(arr[j] < 0)
                            negative_pairs.addElement(new Pair(j,sum_till_now));
                    }
                    j++;
                }
                else{
                    Pair p = negative_pairs.elementAt(0);
                    negative_pairs.removeElementAt(0);
                    i = p.start + 1;
                    int temp  = p.end;
                    sum_till_now-=temp;

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
