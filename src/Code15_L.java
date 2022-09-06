import basicArray.Operations_1D_array;
import basicArray.dynamicArray;

import java.util.Scanner;

public class Code15_L {
    public static void main(String[] args){


        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        n = scan.nextInt();
        dynamicArray array = new dynamicArray(n);

        Operations_1D_array.input(array.arr, scan);

        System.out.println("Input the Index to be Deleted : ");
        int index = scan.nextInt();

        array.deleteElement(index);

        Operations_1D_array.output(array.arr);


    }
}
