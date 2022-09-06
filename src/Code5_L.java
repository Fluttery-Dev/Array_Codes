import basicArray.Operations_1D_array;

import java.util.Scanner;

public class Code5_L {

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

        for (int i = 0; i < freq.length; i++){
            if(freq[i] > 1){
                System.out.println(i + " Occurred " + freq[i] + " Times");
            }
        }


    }
}
