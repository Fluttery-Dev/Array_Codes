import java.util.Scanner;
import java.util.Vector;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Code91_L {
    public static void main(String[] args){

        Vector<Integer> arr = new Vector<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Elements of the array : ");

        String[] strNums = scan.nextLine().split(" ");

        for (int i = 0; i < strNums.length; i++) {
            arr.add(Integer.parseInt(strNums[i]));
        }

        int i = 1;

        while (arr.get(i) > arr.get(i-1)){
            i++;
        }
        int j = arr.size() - 2;
        while (arr.get(j) < arr.get(j+1) && j>i){
            j--;
        }


        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int k = i; k <= j ; k++) {
            if(arr.get(k) < min){
                min = arr.get(k);
            }
            if(arr.get(k) > max){
                max = arr.get(k);
            }
        }


        int minIndex = 0;
        int maxIndex = 0;

        for(int k = 0; k < arr.size(); k++){
            if(arr.get(k) < min)
                minIndex++;

            if(arr.get(k) < max)
                maxIndex++;
        }

        System.out.println("The minimum length of unsorted subarray which makes the given array sorted \n" +
                "lies between the indices " + min(minIndex,i) + " and " + max(j,maxIndex));


        }

    }
