package LearnTheBasics.LearnBasicRecursion;

public class SumOfFirstNNumbers {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(sumOfSeries(n,0));
    }
    static int sumOfSeries(int n,int sum) {
        // code here
        if(n==1){
            return sum+(int)Math.pow(n,3);
        }
        sum+=(int)Math.pow(n,3);
        return sumOfSeries(n-1,sum);
    }
}
