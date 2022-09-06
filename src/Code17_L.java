import basicArray.Operations_1D_array;
import basicArray.dynamicArray;

import java.util.Scanner;

public class Code17_L {
    public static void main(String[] args){

        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        n = scan.nextInt();
        dynamicArray array = new dynamicArray(n);

        Operations_1D_array.input(array.arr, scan);

        Operations_1D_array.sort(array.arr);

        System.out.println("The second largest element is : " + array.arr[array.arr.length - 2]);

    }
}
