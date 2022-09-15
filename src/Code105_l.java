import java.util.Scanner;
import java.util.Vector;

public class Code105_l {
    public static void main(String[] args) {

        Vector<Integer> arr = new Vector<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Elements of the array : ");

        String[] strNums = scan.nextLine().split(" ");

        for (int i = 0; i < strNums.length; i++) {
            arr.add(Integer.parseInt(strNums[i]));
        }

        System.out.println("Enter the value of k : ");
        int k = scan.nextInt();

        int window = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) <= k) {
                window++;
            }
        }

        int[] swapsRequired = new int[arr.size() - window + 1];

        for(int i = 0; i< window;i++){
            if(arr.get(i) > k){
                swapsRequired[0]++;
            }
        }

        for (int i = 1; i < arr.size()-window + 1; i++) {

            swapsRequired[i] = swapsRequired[i-1];

            if(arr.get(i+window-1) > k) {
                    swapsRequired[i] += 1;
                }
            if(arr.get(i-1) > k){
                    swapsRequired[i] -= 1;
                }
        }

        int minSwaps = Integer.MAX_VALUE;

        for (int i = 0; i < swapsRequired.length; i++) {
            if(swapsRequired[i] < minSwaps){
                minSwaps = swapsRequired[i];
            }
        }

        System.out.println("The minimum swaps required are : " + minSwaps);

    }
}
