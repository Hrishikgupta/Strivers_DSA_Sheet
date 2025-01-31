package Strivers_A2Z_DSA_Sheet.Sorting;
//https://www.geeksforgeeks.org/problems/bubble-sort/1
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9, 7};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int arr[]) {
        // code here
        for(int i=0;i<arr.length;i++){
            boolean swapped = false;
            for(int j=1;j<arr.length-i;j++){

                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr [j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
