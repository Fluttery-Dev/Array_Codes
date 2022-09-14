import java.util.Scanner;
import java.util.Vector;

public class Code79_L {
    public static void main(String[] args){

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


        int n = arr.size();
        int[] daddy = new int[n*n + 1];

        for (int i = 0; i < n; i++) {
            daddy[arr.get(i)]++;
        }
        int k =0;
        for(int i = 0; i < daddy.length; i++){
            while(daddy[i]-- > 0){
                arr.set(k++,i);
            }
        }
        System.out.println("\nThe sorted array is : ");

        for (int x : arr) {
            System.out.print(x + " ");
            
        }

    }
}
