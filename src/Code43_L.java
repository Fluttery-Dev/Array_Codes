import basicArray.Operations_1D_array;

import java.util.Scanner;

public class Code43_L {
    public static void main(String[] args) {

        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        n = scan.nextInt();
        int[] arr = new int[n];

        Operations_1D_array.input(arr, scan);
        int[] bigger_element_array = new int[n];
        for (int i = 0; i < n; i++) {
            int max = -1;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    max = arr[j];
                    break;
                }
            }
            bigger_element_array[i] = max;
            System.out.printf("The No greater than %d in the array is %d \n", i, max);
        }

        Operations_1D_array.output(bigger_element_array);
    }
}
