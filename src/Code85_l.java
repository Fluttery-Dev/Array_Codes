import java.util.Scanner;

public class Code85_l {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of the matrix : ");

        int m =scan.nextInt();
        int n =scan.nextInt();

        int totalWays = ways(m,n);

        System.out.println("The total number of ways are : " + totalWays);


    }

    private static int ways(int m, int n) {
        if(m == 1 || n == 1){
            return 1;
        }
        return ways(m-1,n) + ways(m,n-1);
    }
}
