package ArrayQuestion.Easy;
//leetcode-268
//https://leetcode.com/problems/missing-number/description/
public class MissingNumber {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5};
        int n = 5;
        System.out.println(missingNumber(a,n));
    }
    public static int missingNumber(int []a, int N) {
        // Write your code here.
        int i=0;
        while(i<a.length){
            if(a[i]==a.length){
                i++;
                continue;
            }
            if(a[i]>0 && a[i]<N && a[i]!=a[a[i]-1]){
                int correctidx = a[i]-1;
                int temp = a[i];
                a[i]=a[correctidx];
                a[correctidx]=temp;
            }else{
                i++;
            }
        }
        for(int j=0;j<a.length;j++){
            if(a[j]!=j+1){
                return j+1;
            }
        }
        return a.length;
    }
}
