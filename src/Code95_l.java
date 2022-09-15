import java.util.Scanner;
import java.util.Vector;

public class Code95_l {
    public static void main(String[] args) {

        Vector<Integer> arr = new Vector<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Elements of the array : ");

        String[] strNums = scan.nextLine().split(" ");

        for (int i = 0; i < strNums.length; i++) {
            arr.add(Integer.parseInt(strNums[i]));
        }

        int count0 = 0;
        int count1 = 0;

        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == 0){
                count0++;
            }else{
                count1++;
            }
        }

        arr.clear();

        while(count0-- != 0)
            arr.add(0);

        while(count1-- != 0)
            arr.add(1);

        System.out.println("The array after rearranging is : ");

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}