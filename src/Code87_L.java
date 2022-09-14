import java.util.Scanner;
import java.util.Vector;

public class Code87_L {
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
        
        int max = 0;

        for (int i = 1; i < arr.size()-1; i++) {
            if(arr.get(i) > arr.get(i+1) && arr.get(i) > arr.get(i-1) && arr.get(i) > max){
                max = arr.get(i);
            }
        }

        System.out.println("\nThe maximum element which is increasing then decreasing is: " + max);
    }
}
