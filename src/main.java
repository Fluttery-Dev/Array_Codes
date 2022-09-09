import basicArray.Operations_1D_array;

import java.util.Scanner;
import java.util.Vector;

public class main {
    public static void main(String[] args){

        Vector<Integer> arr = new Vector<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Elements of the array : ");

        String[] strNums = scan.nextLine().split(" ");

        for (int i = 0; i < strNums.length; i++) {
            arr.add(Integer.parseInt(strNums[i]));
        }


    }
}
