

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Code59_L {
        public static void main(String[] args) {

            Vector<Integer> arr = new Vector<Integer>();
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the Elements of the array : ");

            String[] strNums = scan.nextLine().split(" ");

            for (int i = 0; i < strNums.length; i++) {
                arr.add(Integer.parseInt(strNums[i]));
            }
            int[] count = new int[Collections.max(arr) + 1];

            for (int i = 0; i < arr.size(); i++) {
                count[arr.get(i)]++;
            }

            int[] output = new int[arr.size()];

            for (int i = 1; i < count.length; i++) {
                count[i] += count[i - 1];
            }

            for (int i = 0; i < arr.size(); i++) {
                output[count[arr.get(i)] - 1] = arr.get(i);
                count[arr.get(i)]--;
            }

            for (int i = 0; i < arr.size(); i++) {
                arr.set(i, output[i]);
            }

            System.out.println("The sorted array is : ");
            for (int i = 0; i < arr.size(); i++) {
                System.out.print(arr.get(i) + " ");
            }
        }
    }
