import java.util.Scanner;
import java.util.Vector;

public class Code103_l {
    public static void main(String[] args) {

        Vector<Integer> arr = new Vector<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Elements of the array : ");

        String[] strNums = scan.nextLine().split(" ");

        for (int i = 0; i < strNums.length; i++) {
            arr.add(Integer.parseInt(strNums[i]));
        }

        int[] modifiedArray = new int[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            if (i == 0) {
                modifiedArray[i] = arr.get(i + 1)*arr.get(i);
            }
            else if (i == arr.size() - 1) {
                modifiedArray[i] = arr.get(i - 1) * arr.get(i);
            } else {
                modifiedArray[i] = arr.get(i - 1) * arr.get(i + 1);
            }
        }

        System.out.println("The modified array is : ");

        for (int i = 0; i < modifiedArray.length; i++) {
            System.out.print(modifiedArray[i] + " ");
        }
    }
    }
