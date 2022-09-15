import java.util.Scanner;
import java.util.Vector;

import static java.lang.Math.min;

public class Code89_l {
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

        if (!printMatrix(matrix, min(matrix.size(), matrix.get(0).size())))
            System.out.println("there is no square submatrix with all 1's");
    }

    private static boolean printMatrix(Vector<Vector<Integer>> matrix, int n) {
            return isdesirable(matrix, 0, 0, n) || isdesirable(matrix, 0, 0, n - 1);
    }

    private static boolean isdesirable(Vector<Vector<Integer>> matrix, int x, int y, int i) {
        if (matrix.size() - x >= i && matrix.get(0).size() - y >= i) {
            for (int j = x; j < i; j++) {
                for (int k = y; k < i; k++) {
                    if (matrix.get(j).get(k) != 1)
                        return false || isdesirable(matrix, x + 1, y, i) || isdesirable(matrix, x, y + 1, i);
                }

            }
            System.out.println("The square submatrix with all 1's is : ");

            for (int j = x; j < i; j++) {
                for (int k = y; k < i; k++) {
                    System.out.print(matrix.get(j).get(k) + " ");
                }
                System.out.println();
            }
            return true;
        }
        return false;

    }
}

