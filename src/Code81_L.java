import java.util.Scanner;
import java.util.Vector;

import static java.util.Collections.max;

public class Code81_L {
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

        for (int x : arr) {
            freq[x]++;
        }
        int maxFreq = 0;
        int maxFreqEle = 0;

        for (int i = 0; i < freq.length; i++) {
            if(freq[i] > maxFreq){
                maxFreq = freq[i];
                maxFreqEle = i;
            }
        }

        System.out.println("The most frequent element is : " + maxFreqEle);
    }
}
