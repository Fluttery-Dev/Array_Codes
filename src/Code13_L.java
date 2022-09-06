import basicArray.Operations_1D_array;
import basicArray.dynamicArray;
import java.util.Scanner;

public class Code13_L {
    public static void main(String[] args){

        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        n = scan.nextInt();
        dynamicArray array = new dynamicArray(n);

        Operations_1D_array.input(array.arr, scan);

        System.out.println("Input the element to be Inserted : ");
        int element = scan.nextInt();

        System.out.println("Input the Index to be Inserted : ");
        int index = scan.nextInt();

        array.addElement(index, element);

        Operations_1D_array.output(array.arr);

    }
}
