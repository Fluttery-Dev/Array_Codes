import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Code77_l {
    public static void main(String[] args) {

        Vector<Integer> arr = new Vector<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Elements of the array : ");

        String[] strNums = scan.nextLine().split(" ");

        for (int i = 0; i < strNums.length; i++) {
            arr.add(Integer.parseInt(strNums[i]));
        }

        Random rand = new Random();

        for (int i = 0; i < arr.size(); i++) {
            int temp = rand.nextInt(arr.size());
            arr.set(temp, arr.get(i));
            arr.set(i, arr.get(temp));
        }

        System.out.println("The shuffled array is : ");

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
