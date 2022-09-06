
import basicArray.Operations_1D_array;

import java.util.HashMap;
import java.util.Scanner;

public class Code_6
{
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        n = scan.nextInt();
        int[] arr = new int[n];
        Operations_1D_array.input(arr, scan);
        HashMap<Integer,Integer>hashmap = new HashMap<Integer,Integer>();
        for (int j = 0; j < arr.length; j++) {
            hashmap.put(arr[j], j);
        }
        System.out.println(hashmap.keySet());

    }

}
