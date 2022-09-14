import basicArray.Operations_1D_array;

import java.util.Scanner;

public class Code10_S
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        int index = 0;
        n = arr.length;
        while (index < n) {
            if (index == 0)
                index++;
            if (compare(arr[index], arr[index - 1]))
                index++;
            else {
                int temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                index--;
            }
        }
    }

        public static boolean compare(int a, int b) {
        if (a % 2 == b % 2) return a > b;
        return a % 2 == 1;
    }
    {
        int[] a = {3, 2, 5, 6, 4, 9, 11, 7};
        for (int i : a)
        {
            System.out.print(i + " ");
        }
    }

    }

        