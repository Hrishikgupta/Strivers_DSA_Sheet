package ArrayQuestion.Easy;

import java.util.Arrays;

public class RotateArrayByKElement {
    public static void main(String[] args) {
        int[] arr = {3,7,8,9,10,11};
        int k = 2;
        Rotatetoright(arr,arr.length,k);
        System.out.println(Arrays.toString(arr));
    }
    public static void Rotatetoright(int[] arr, int n, int k) {
        while(k>0){
            for(int i=n-1;i>0;i--){
                swap(arr,i,i-1);
            }
            k--;
        }
    }
    static void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
