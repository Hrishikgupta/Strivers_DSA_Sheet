package ArrayQuestion.Easy;

import java.util.Arrays;

public class LeftRotateArrayByOne {
    public static void main(String[] args) {
        int[] arr = {5,7,3,2};
        System.out.println(Arrays.toString(rotateArray(arr,arr.length)));
    }
    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        for(int i=1;i<n;i++){
            swap(arr,i,i-1);
        }
        return arr;

    }
    static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]= temp;
    }
}
