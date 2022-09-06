package basicArray;

public class dynamicArray {

    public int[] arr = null;
    int arrSize;

    public dynamicArray(int n){
         arr = new int[n];
         arrSize = n;
    }

    public void growSize(int n){
        int[] temp = new int[arrSize + n];

        copy(temp, arr, arrSize);

        arr = temp;
        arrSize = arr.length;
    }


    public void shrinkSize(int n){
        int[] temp = new int[arrSize - n];

        copy(temp, arr, arrSize-n);

        arr = temp;
        arrSize = arr.length;
    }

    public void addElement(int index, int element) {

        growSize(1);

        for (int i = arrSize-1; i > index; i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = element;

    }

    public void deleteElement(int index) {

        for (int i = index; i < arrSize - 1; i++) {
            arr[i] = arr[i+1];
        }
        shrinkSize(1);

    }

    public void copy(int [] dest, int[] source, int n){

        for (int i = 0; i < n; i++) {
            dest[i] = source[i];
        }
    }




}