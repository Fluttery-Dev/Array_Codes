import java.util.Scanner;
import java.util.Vector;

public class Code75_L {
    public static void main(String[] args) {

        Vector<Vector<Integer>> matrix = new Vector<Vector<Integer>>();

        Vector<Integer> row = new Vector<Integer>();

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Elements of the matrix : ");

        String[] strNums = scan.nextLine().split(" ");
        System.out.println(strNums.length);
        do {
            for (String strNum : strNums) {
                row.add(Integer.parseInt(strNum));
            }
            matrix.add(row);
            row = new Vector<Integer>();
            strNums = scan.nextLine().split(" ");
        } while (strNums.length > 1);

        System.out.println("The elements of the lower triangular matrix are : ");
        int sum = 0;
        for (int i = 0; i < matrix.size(); i++) {
            for(int j = 0; j < i; j++){
                System.out.println(matrix.get(i).get(j));
                sum+=matrix.get(i).get(j);
            }
        }

        System.out.println("The Sum of the lower triangular Matrix Elements are: " + sum);
    }
}
