import basicArray.Operations_1D_array;

import java.util.Scanner;
import java.util.Vector;

public class Code55_L {
    public static void main(String[] args) {

        Vector<Integer> v = new Vector<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Elements of the array : ");

        String[] strNums = scan.nextLine().split(" ");

        for (int i = 0; i < strNums.length; i++) {
            v.add(Integer.parseInt(strNums[i]));
        }
        System.out.println("Enter the elements of the subset : ");

        Vector <Integer> sub = new Vector<Integer>();

        strNums = scan.nextLine().split(" ");

        for (int i = 0; i < strNums.length; i++) {
            sub.add(Integer.parseInt(strNums[i]));
        }

        for (int x:sub){
            if(!v.contains(x)){
                System.out.println("The given subset is not a subset of the given array");
                return;
            }
        }
        System.out.println("The given subset is a subset of the given array");

    }
}
