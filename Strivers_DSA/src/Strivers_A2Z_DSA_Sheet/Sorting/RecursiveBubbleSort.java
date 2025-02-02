package Strivers_A2Z_DSA_Sheet.Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RecursiveBubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9, 7};
        bubbleSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));

    }
    public static void bubbleSort(int arr[],int n) {
        if(n==1){
            return;
        }
        for(int j=0;j<n-2;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1]=temp;
            }
        }
        bubbleSort(arr,n-1);
    }
}
