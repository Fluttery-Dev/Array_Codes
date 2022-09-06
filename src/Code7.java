import basicArray.Operations_1D_array;

import java.util.Scanner;

public class Code7 {
    public static void main(String[] args){

        int n1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of First array : ");
        n1 = scan.nextInt();
        int[] arr1 = new int[n1];

        Operations_1D_array.input(arr1, scan);

        int n2;
        System.out.println("Enter the size of Second array : ");
        n2 = scan.nextInt();
        int[] arr2 = new int[n2];
        Operations_1D_array.input(arr2, scan);

        int [] arr = new int[n1 + n2];
        int i = 0, j = 0;

        while(i < n1 && j < n2 ){

            if(arr1[n1 - i - 1] > arr2[n2 - j - 1]){
                arr[i+j] = arr1[n1 - i - 1];
                i++;
            }
            else {
                arr[i + j] = arr2[n2 - j - 1];
                j++;
            }
        }

        while(i < n1){
            arr[i+j] = arr1[n1 - i++ -1];
        }

        while (j < n2){
            arr[i+j] = arr2[n2 - j++ -1];
        }

        Operations_1D_array.output(arr);

    }
}
