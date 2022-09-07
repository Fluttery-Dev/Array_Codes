import array_2D.Operation_2D_array;
import basicArray.Operations_1D_array;

import java.util.Scanner;

public class Code25_L {

        public static void main(String[] args) {

            int n;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the no of rows : ");
            n = scan.nextInt();

            int[][] arr = new int[n][n];
            Operation_2D_array.input(arr, scan);

            int[] sum_row = new int[n];
            int[] sum_col = new int[n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    sum_row[i] += arr[i][j];
                    sum_col[j] += arr[i][j];
                }
            }

            Operations_1D_array.output(sum_row);
            Operations_1D_array.output(sum_col);
        }
    }

