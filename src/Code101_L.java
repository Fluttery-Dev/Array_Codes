import java.util.Scanner;
import java.util.Vector;

public class Code101_L {
    public static void main(String[] args) {

        Vector<Integer> arr = new Vector<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Elements of the array : ");

        String[] strNums = scan.nextLine().split(" ");

        for (int i = 0; i < strNums.length; i++) {
            arr.add(Integer.parseInt(strNums[i]));
        }

        int n = arr.size();

        boolean[] isPresent = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (arr.get(i) >= 0)
                isPresent[arr.get(i)] = true;
        }

        arr.clear();

        for (int i = 0; i < n; i++) {
            if (isPresent[i])
                arr.add(i);
            else
                arr.add(-1);
        }

        System.out.println("The array after rearranging is : ");

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}