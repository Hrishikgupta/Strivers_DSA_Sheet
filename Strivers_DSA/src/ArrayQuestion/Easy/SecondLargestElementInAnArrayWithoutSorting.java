package ArrayQuestion.Easy;

public class SecondLargestElementInAnArrayWithoutSorting {
    public static void main(String[] args) {
        int[] arr = {10,10,5};
        System.out.println(getSecondLargest(arr));
    }
    public static int getSecondLargest(int[] arr) {
        // Code Here
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                arr[i]=-1;
            }
            if(secondMax<arr[i]){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
}
