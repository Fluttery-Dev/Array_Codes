import java.util.Scanner;
import basicArray.Operations_1D_array;

public class Code1_L {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[n];

       Operations_1D_array.input(arr, scan);
       Operations_1D_array.output(arr);

        for (int i = 0 ; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
