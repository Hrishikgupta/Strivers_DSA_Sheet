package Strivers_A2Z_DSA_Sheet.Sorting;

import java.util.Arrays;

public class RecursiveSelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9, 7};
        SelectionSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));

    }
    static void SelectionSort(int[] arr,int n){
        if(n==0){
            return;
        }
        int max = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        int temp = arr[n-1];
        arr[n-1] = arr[max];
        arr[max] = temp;
        SelectionSort(arr,n-1);
    }
}
