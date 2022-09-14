import java.util.Scanner;
import java.util.Vector;

import static java.util.Collections.max;

public class Code73_l {
    public static void main(String[] args) {

        Vector<Integer> arr = new Vector<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Elements of the array : ");

        String[] strNums = scan.nextLine().split(" ");

        for (int i = 0; i < strNums.length; i++) {
            arr.add(Integer.parseInt(strNums[i]));
        }

        int max = max(arr);
        int[] freq = new int[max + 1];

        for (int x:arr) {
            freq[x]++;
        }

        System.out.println("unique elements are : ");

        for (int i = 1; i < freq.length; i++) {
            if(freq[i] > 0){
                System.out.print(i + " ");
            }
        }


    }
}
