import java.util.Arrays;
public class Code_102S
{
        public static void rearrangeArray(int arr[], int n)
        {
            Arrays.sort(arr);

            int[] tempArr = new int[n];

            int ArrIndex = 0;

            for (int i = 0, j = n-1; i <= n / 2 || j > n / 2;
                 i++, j--) {
                if(ArrIndex < n)
                {
                    tempArr[ArrIndex] = arr[i];
                    ArrIndex++;
                }

                if(ArrIndex < n)
                {
                    tempArr[ArrIndex] = arr[j];
                    ArrIndex++;
                }
            }

            for (int i = 0; i < n; i++)
                arr[i] = tempArr[i];
        }

        public static void main(String args[])
        {
            int arr[] = {45,26,98,23,45,358,25,3558,55,748,23456,45 };
            int n = arr.length;
            rearrangeArray(arr, n);

            for (int i = 0; i < n; i++)
                System.out.print(arr[i]+" ");
        }
    }

