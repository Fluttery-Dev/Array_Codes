import java.util.Scanner;
import java.util.Vector;

public class Code107_L {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Elements of the array : ");

        String[] strNums = scan.nextLine().split(" ");

        Vector<Integer> arr1 = new Vector<Integer>();
        for (int i = 0; i < strNums.length; i++) {
            arr1.add(Integer.parseInt(strNums[i]));
        }

        System.out.println("Enter the Elements of the sECOND array : ");

        strNums = scan.nextLine().split(" ");

        Vector<Integer> arr2 = new Vector<Integer>();
        for (int i = 0; i < strNums.length; i++) {
            arr2.add(Integer.parseInt(strNums[i]));
        }

        Vector<Integer> arr = new Vector<Integer>();

        int i = 0;

        while (i < arr1.size()) {
            arr.add(arr1.get(i));
            i++;
        }

        i = 0;
        while (i < arr2.size()) {
            arr.add(arr2.get(i));
            i++;
        }
        System.out.println("The merged array is : ");

        for (i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}
