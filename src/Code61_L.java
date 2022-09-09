import java.util.Scanner;
import java.util.Vector;

public class Code61_L {

    public static void main(String[] args) {

        Vector<Integer> arr = new Vector<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Elements of the array : ");

        String[] strNums = scan.nextLine().split(" ");

        for (int i = 0; i < strNums.length; i++) {
            arr.add(Integer.parseInt(strNums[i]));
        }

        int j = 0;
        int product_till_now = 1;
        int max_product = 0;
        int negative_count = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                negative_count++;
            }
        }

        while (j < arr.size()) {

           if(arr.get(j) < 0){
               if(--negative_count ==0 && product_till_now > 0){
                   product_till_now = 1;
               }
               else{
                   product_till_now *= arr.get(j);
               }
               j++;
           }

           else if(arr.get(j) == 0){
               product_till_now = 1;
               j++;
           }

           else{
               product_till_now *= arr.get(j);
               j++;
           }

            if (product_till_now > max_product) {
                max_product = product_till_now;
            }
        }
        System.out.println("The maximum product is : "+ max_product);
    }

}

