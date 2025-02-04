package Strivers_A2Z_DSA_Sheet.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4,6,2,5,7,9,1,3};
        quickSorting(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSorting(int[] arr,int low, int high){
        if(low < high){
            int pIndex = partition(arr,low,high);
            quickSorting(arr,low,pIndex-1);
            quickSorting(arr,pIndex+1,high);
        }
    }
    static int partition(int[] arr, int low, int high){
        int piviot = arr[low];
        int l = low;
        int h = high;
        while (l<h){
            while(arr[l]<= piviot && l<=high-1){
                l++;
            }
            while(arr[h] > piviot && h>=low+1){
                h--;
            }
            if(l<h){
                int temp = arr[l];
                arr[l]=arr[h];
                arr[h]=temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[h];
        arr[h] = temp;
        return h;
    }
}
