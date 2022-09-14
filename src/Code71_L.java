import java.util.Scanner;
import java.util.Vector;

public class Code71_L {
    public static void main(String[] args) {

        Vector<Integer> arr1 = new Vector<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Elements of first the array : ");

        String[] strNums = scan.nextLine().split(" ");

        for (int i = 0; i < strNums.length; i++) {
            arr1.add(Integer.parseInt(strNums[i]));
        }

        Vector<Integer> arr2 = new Vector<Integer>();
        System.out.println("Enter the Elements of Second the array : ");

        strNums = scan.nextLine().split(" ");

        for (int i = 0; i < strNums.length; i++) {
            arr2.add(Integer.parseInt(strNums[i]));
        }
        System.out.println();

        System.out.println("Elements of the first array are : ");
        for (int x:arr1) {
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.println("Elements of the Second array are : ");
        for (int x:arr2) {
            System.out.print(x + " ");
        }

        Vector<Integer> arr = new Vector<Integer>();

        int i = 0;
        int j = 0;
        while (i < arr1.size() && j < arr2.size()){
            if(arr1.get(i) < arr2.get(j)){
                arr.add(arr1.get(i++));
            }
            else{
                arr.add(arr2.get(j++));
            }
        }

        while (i < arr1.size()){
            arr.add(arr1.get(i++));
        }

        while (j < arr2.size()){
            arr.add(arr2.get(j++));
        }

        float median;

        if(arr.size() %2 == 0){
            median = (float)(arr.get(arr.size()/2) + arr.get(arr.size()/2 - 1))/2;
        }
        else{
            median = arr.get(arr.size()/2);
        }

        System.out.println("Median of the two arrays is : " + median);

    }
}
