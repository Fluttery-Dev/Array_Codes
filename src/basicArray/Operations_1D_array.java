package basicArray;

import java.util.Scanner;

public class Operations_1D_array {

    public static void input(int[] arr, Scanner scan){
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < arr.length; i++){
            System.out.println("Element - " + (i+1) + " : ");
            arr[i]=scan.nextInt();
        }
    }

    public static void input(int[][] arr, Scanner scan){

        for (int i = 0; i < arr.length; i++){
            System.out.println("Enter the elements of the row : " + i+1);

            for (int j = 0; j < arr.length; j++) {
                System.out.print("Element - " + (i+1) + " : ");
                arr[i][j]=scan.nextInt();
            }
            System.out.println();
        }
    }


    public static void output(int[] arr){
        System.out.println("The Elements of the array are : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element - " + i + " : " + arr[i]);
        }
    }


    public static void output(int[][] arr){

        for (int i = 0; i < arr.length; i++){
            System.out.println("Elements of row : " + i+1);

            for (int j = 0; j < arr.length; j++) {
                System.out.print("Element - " + (i+1) + " : ");
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    }


    public static int max(int[] arr){
        int maxValue = Integer.MIN_VALUE;

        for (int x : arr){
            if (x > maxValue){
                maxValue = x;
            }
        }

        return maxValue;
    }

    public static int min(int[] arr){
        int minValue = Integer.MAX_VALUE;

        for (int x : arr){
            if (x < minValue){
                minValue = x;
            }
        }

        return minValue;
    }

    public static boolean search(int[] arr, int n){
        int flag = 0;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] == n)
            {
                flag = 1;
                break;
            }
            else
            {
                flag = 0;
            }
        }
        return flag == 1;
    }

    public static void sort(int[] arr){

        bubbleSort(arr, 0, arr.length - 1);
    }

    static void bubbleSort(int [] arr, int start, int end){

        if(start == end)
            return;

        for (int i = 0; i < end; i++) {
            if (arr[i] > arr[i+1]){
                int temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;
            }
        }
        bubbleSort(arr, start, end - 1);
    }

 //    Merge sort Not working ---- fix later
//    static void mergeSort (int[] arr, int start, int end){
//        if ( start >= end-1)
//            return;
//
//        int mid = (end - start) / 2 + start;
//        mergeSort(arr, start, mid +1);
//        mergeSort(arr, mid + 1, end);
//
//        merge(arr, start, end);
//
//    }
//
//    static void merge(int[] arr, int start, int end){
//
//        int mid = (end-start)/2;
//        int n1 = mid + 1;
//        int n2 = end;
//
//        int [] temp = new int[n2];
//        int i = start, j = mid + 1;
//        int k = start;
//
//        while(i < n1 && j < n2 ){
//
//            if(arr[n1 - i - 1] < arr[n2 - j - 1]){
//                temp[k] = arr[n1 - i - 1];
//                i++;
//            }
//            else {
//                temp[k] = arr[n2 - j - 1];
//                j++;
//            }
//            k++;
//        }
//        while(i < n1){
//            temp[i+j] = arr[n1 - i -1];
//            i++;
//            k++;
//        }
//
//        while (j < n2){
//            temp[i+j] = arr[n2 - j -1];
//            j++;
//            k++;
//        }
//
//        for ( k = start; k < end; k++) {
//            arr[k] = temp[k];
//        }
//    }


    public static void reverse(int[] arr)
    {
        int n = arr.length;

        for (int i = 0; i <= n/2; i++)
        {
            int temp = arr[n-i-1];
            arr[n-i-1] = arr[i];
            arr[i] = temp;
        }

    }

    // Code for removing duplicate elements in an array

}
