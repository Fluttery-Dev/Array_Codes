import java.util.Scanner;
import java.util.Vector;

public class Code93_l {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Vector<Integer> arr = new Vector<Integer>();
        String[] strNums = scan.nextLine().split(" ");

        for (String num : strNums) {
            arr.add(Integer.parseInt(num));
        }

        Vector<Integer> negative = new Vector<Integer>();
        Vector<Integer> positive = new Vector<Integer>();

        for (int x : arr) {
            if (x < 0) {
                negative.add(x);
            } else {
                positive.add(x);
            }
        }

        arr.clear();

        int i = 0;
        int j = 0;
        while(i< negative.size() && j < positive.size()){
            arr.add(negative.get(i));
            arr.add(positive.get(j));
            i++;
            j++;
        }

        while (i < negative.size()) {
            arr.add(negative.get(i));
            i++;
        }

        while (j < positive.size()) {
            arr.add(positive.get(j));
            j++;
        }

        System.out.println("The array after rearranging is : ");

        for (int x : arr) {
            System.out.print(x + " ");
        }

    }
}
