import java.util.Scanner;
import java.util.Vector;

public class Code65_L {
    public static void main(String[] args) {

        Vector<Integer> arr = new Vector<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Elements of the array : ");

        String[] strNums = scan.nextLine().split(" ");

        for (int i = 0; i < strNums.length; i++) {
            arr.add(Integer.parseInt(strNums[i]));
        }

        int product = 1;

        for (int x:arr) {
            product*= x;
        }

        int[] productArray = new int[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            productArray[i] = product/arr.get(i);
        }

        for (int x:productArray) {
            System.out.print(x + " ");
        }
    }
}
