import java.util.Scanner;

public class Code_104S
{
    public static void evenOddComparison(int arr[], int n)
    {
        int temp;
        for (int i = 0; i < n - 1; i++)
        {
            if (i % 2 == 0 && arr[i] > arr[i + 1])
            {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            if (i % 2 != 0 && arr[i] < arr[i + 1])
            {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }
    public static void printArray(int arr[], int size)
    {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args)
    {
        int arr[]={1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = arr.length;
        evenOddComparison (arr, n);
        printArray(arr, n);
    }
}
