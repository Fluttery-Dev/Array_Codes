import java.util.Scanner;

public class Code_100S
{
    public static void main(String args[])
    {
        int nums;
        int length;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        nums = sc.nextInt();
        int[] arr = new int[nums];
        boolean match = false;
        int count = 0;
        for (int i = 0; i < arr.length-1; i++)
        {
            if (arr[i + 1] == arr[i])
            {
                if (!match) {
                    match = true;
                    count++;
                }
            }
        else {
                match = false;
            }
        }
        System.out.println(count);
    }
}
