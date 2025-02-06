package ArrayQuestion.Easy;

public class RemoveDuplicatesinplacefromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3};
        System.out.println(removeDuplicates(arr,arr.length));
    }
    public static int removeDuplicates(int[] arr,int n) {
        // Write your code here.
        int length = 1;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                length++;
            }
        }
        return length;
    }
}
