package ArrayQuestion.Easy;


public class CheckIfTheArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 3, 5};
        System.out.println(isSorted(arr.length,arr));
    }
    public static int isSorted(int n, int []a) {
        // Write your code here.
        for (int i = 0; i < n-1; i++) {
            if (a[i] > a[i + 1]) {
                return 0;
            }
        }
        return 1;
    }
}
