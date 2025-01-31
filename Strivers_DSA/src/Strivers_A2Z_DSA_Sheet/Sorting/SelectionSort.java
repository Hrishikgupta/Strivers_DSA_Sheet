package Strivers_A2Z_DSA_Sheet.Sorting;

import java.util.Arrays;

//https://www.geeksforgeeks.org/problems/selection-sort/1
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9, 7};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr) {
        // code here
        for(int i=0;i<arr.length;i++){
            int lastindex = arr.length-i-1;
            int max = MaxIndex(arr,0,lastindex);
            int temp = arr[max];
            arr[max] = arr[lastindex];
            arr[lastindex] = temp;
        }
    }
    static int MaxIndex(int[] arr, int start, int last){
        int max = start;
        for(int i=start;i<=last;i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
}
