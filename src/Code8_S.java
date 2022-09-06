import basicArray.Operations_1D_array;

import java.util.Scanner;

public class Code8_S
{
    public static void main(String[] args)
    {

        int n1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of First array : ");
        n1 = scan.nextInt();
        int[] arr1 = new int[n1];
        Operations_1D_array.input(arr1, scan);
        int [] fr = new int [arr1.length];
        int visited = -1;
        for(int i = 0; i < arr1.length; i++){
            int count = 1;
            for(int j = i+1; j < arr1.length; j++){
                if(arr1[i] == arr1[j]){
                    count++;
                    fr[j] = visited;
                }
            }
            if(fr[i] != visited)
                fr[i] = count;
        }

        System.out.println("---------------------------------------");
        System.out.println(" Element | Frequency");
        System.out.println("---------------------------------------");
        for(int i = 0; i < fr.length; i++){
            if(fr[i] != visited)
                System.out.println("    " + arr1[i] + "    |    " + fr[i]);
        }
        System.out.println("----------------------------------------");
    }

}
