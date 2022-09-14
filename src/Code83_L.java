import java.util.Scanner;
import java.util.Vector;

public class Code83_L {
    public static void main(String[] args) {

        Vector<Integer> arr = new Vector<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Elements of the array : ");

        String[] strNums = scan.nextLine().split(" ");

        for (int i = 0; i < strNums.length; i++) {
            arr.add(Integer.parseInt(strNums[i]));
        }

        System.out.println("the given array is : ");

        for (int x:arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        int diff;
        diff = scan.nextInt();

        int n = arr.size();
        System.out.println("The pairs are : ");
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(Math.abs(arr.get(i) - arr.get(j)) == diff){
                    System.out.println(arr.get(i) + " " + arr.get(j));
                }
            }
        }
    }
}