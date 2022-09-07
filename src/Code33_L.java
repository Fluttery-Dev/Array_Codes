import basicArray.Operations_1D_array;

import java.util.Scanner;

public class Code33_L {
    public static void main(String[] args){

        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        n = scan.nextInt();
        int[] arr = new int[n];

        Operations_1D_array.input(arr, scan);


        int max = Operations_1D_array.max(arr);
        int[] freq = new int[max+1];

        for(int x:arr){
            freq[x]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if(freq[i] > n/2){
                System.out.println("The majority element is : " + i);
                return;
            }
        }
        System.out.println("There are no Majority Elements in the given array");


    }
}
