import java.util.Scanner;
import java.util.Vector;

public class Code99_L {
    public static void main(String[] args) {

        Vector<Integer> arr = new Vector<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Elements of the array : ");

        String[] strNums = scan.nextLine().split(" ");

        for (int i = 0; i < strNums.length; i++) {
            arr.add(Integer.parseInt(strNums[i]));
        }
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < arr.size(); i++) {
            rightSum += arr.get(i);
        }

        for (int i = arr.size() - 1; i >= 0; i--) {
            leftSum += arr.get(i);
            rightSum -= arr.get(i);
            if (leftSum == rightSum) {
                System.out.println("The equilibrium index is: " + i);
                return;
            }
        }

        System.out.println("No equilibrium index found");

    }
}
