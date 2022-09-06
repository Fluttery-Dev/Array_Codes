import basicArray.Operations_1D_array;
import java.util.Scanner;

public class Code2_S {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        Operations_1D_array.input(arr, sc);

        Operations_1D_array.reverse(arr);
        Operations_1D_array.output(arr);
    }
}