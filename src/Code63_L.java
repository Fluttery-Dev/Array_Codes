import java.util.Scanner;
import java.util.Vector;

public class Code63_L {
        public static void main(String[] args) {

            Vector<Integer> arr = new Vector<>();
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the Elements of the array : ");

            String[] strNums = scan.nextLine().split(" ");

            for (int i = 0; i < strNums.length; i++) {
                arr.add(Integer.parseInt(strNums[i]));
            }


            for (int i = 0; i < arr.size() - 1; i++) {
                int max = i+1;
                for (int j = i+1; j < arr.size(); j++) {
                    if(arr.get(j) > arr.get(max)){
                        max = j;
                    }
                }
                arr.set(i, arr.get(max));
            }

            arr.set(arr.size() - 1, 0);

            for (int x: arr) {
                System.out.print(x + " ");
            }
        }
    }
