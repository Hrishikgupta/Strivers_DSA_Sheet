package Strivers_A2Z_DSA_Sheet.Sorting;

import java.util.Arrays;

public class RecursiveInsertionSort {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9, 7};
        InsertionSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));

    }
    public static void InsertionSort(int[] arr,int i,int n){
        if (i == n) return;

        int j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }
        InsertionSort(arr, i + 1, n);
    }
}
