package LearnTheBasics.LearnBasicRecursion;

import java.util.ArrayList;
import java.util.Arrays;
//https://www.geeksforgeeks.org/problems/reverse-an-array/0
public class ReverseaAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverseArray(int arr[]) {
        // code here
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[arr.length-i-1];
            arr[arr.length-i-1]=arr[i];
            arr[i]=temp;
        }
    }
}
