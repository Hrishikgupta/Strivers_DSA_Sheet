package Strivers_A2Z_DSA_Sheet.Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9, 7};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static void mergeSort(int arr[], int start, int end) {
        // code here
        if(start>=end){
            return;
        }
        int mid = start + (end-start)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,start,mid,end);
    }
    static void merge(int[] arr, int start, int mid, int end){
        int begin = start;
        int begin2 = mid+1;
        ArrayList<Integer> temp = new ArrayList<>();
        while(begin<=mid && begin2 <= end){
            if(arr[begin]<=arr[begin2]){
                temp.add(arr[begin]);
                begin++;
            }else{
                temp.add(arr[begin2]);
                begin2++;
            }
        }
        while(begin<=mid){
            temp.add(arr[begin]);
            begin++;
        }
        while(begin2<=end){
            temp.add(arr[begin2]);
            begin2++;
        }
        int i=0;
        for(int num: temp){
            arr[start+i]=num;
            i++;
        }
    }
}
