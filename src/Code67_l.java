import java.util.Scanner;
import java.util.Vector;

import static java.util.Collections.binarySearch;

public class Code67_l {
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
        }while (strNums.length > 1);

        System.out.println("Enter the no to be searched in the Matrix : ");
        int n = scan.nextInt();

        int start = 0;
        int end = matrix.size() - 1;

        while (start <=end) {

            int mid = (start + end) / 2;

            Vector<Integer> midRow = matrix.get(mid);

            if (midRow.get(0) <= n && midRow.get(midRow.size() - 1) >= n) {
                int index = binarySearch(midRow, n);

                if (index >= 0) {
                    System.out.println("Found at " + mid + " " + index);
                    return;
                }
            } else if (midRow.get(0) > n) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        System.out.println("Not Found");
    }
}

    // factorial of a number
