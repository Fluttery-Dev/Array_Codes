import java.util.Scanner;
import java.util.Vector;




public class Code69_l {

    public static class Pair{
        int num1;
        int num2;

        int diff;
        public Pair(int num1, int num2){
            this.num1 = num1;
            this.num2 = num2;
            this.diff = Math.abs(num2 - num1);
        }
    }

    public static void main(String[] args) {

        Vector<Integer> arr = new Vector<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Elements of the array : ");

        String[] strNums = scan.nextLine().split(" ");

        for (int i = 0; i < strNums.length; i++) {
            arr.add(Integer.parseInt(strNums[i]));
        }

        Vector<Pair> pairs = new Vector<Pair>();

        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {

                if(arr.get(j) > arr.get(i)) {
                    pairs.add(new Pair(arr.get(i), arr.get(j)));
                }
            }

        }

        Pair maxPair = pairs.get(0);
        for (Pair x:pairs) {
            if(x.diff > maxPair.diff){
                maxPair = x;
            }
        }

        System.out.println("The pair with maximum difference is : " + maxPair.num1 + " " + maxPair.num2);
        System.out.println("The difference is : " + maxPair.diff);

    }
}
