import basicArray.Operations_1D_array;

import java.util.Scanner;
import java.util.Vector;

public class Code57_L {
    public static void main(String[] args){

        Vector<Integer> arr = new Vector<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Elements of the array : ");

        String[] strNums = scan.nextLine().split(" ");

        for (int i = 0; i < strNums.length; i++) {
            arr.add(Integer.parseInt(strNums[i]));
        }

        int start = 0;
        int end = arr.size() - 1;
        int mid;
        int before;
        int after;
        int pivot = -1;
        while(start <= end){
            mid = (end-start)/2 + start;
            pivot = arr.get(mid);
            if(mid == arr.size()-1)
                after = 0;
            else
                after = arr.get(mid + 1);

            if(mid == 0)
                before = 0;
            else
                before = arr.get(mid - 1);


            if( pivot < before && pivot < after){
                System.out.println("The Smallest element is : " + pivot);
                break;
            }
            else if (pivot > before) {
                start = mid + 1;
            }
            else if (pivot > after) {
                end = mid-1;
            }
        }

        System.out.println("There smallest element is : " + pivot);
    }
}
