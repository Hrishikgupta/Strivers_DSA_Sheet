package LearnTheBasics.KnowBasicMaths;

public class PrintAllDivisor {
    public static void main(String[] args) {
        System.out.println(sumOfAllDivisors(3));
    }
    //<-------------------------Started Approach------------------------------>
//    public static int sumOfAllDivisors(int n){
//        // Write your code here.
//        int sum = 0;
//
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                if(i%j==0){
//                    sum += j;
//                }
//            }
//        }
//        return sum;
//    }
    //<-------------------------Average Approach------------------------------>
//    public static int sumOfAllDivisors(int n) {
//        int sum = 0;
//
//        // Loop through each number i from 1 to n
//        for (int i = 1; i <= n; i++) {
//            int tempSum = 0;
//
//            // Find divisors of i by checking up to sqrt(i)
//            for (int j = 1; j * j <= i; j++) {
//                if (i % j == 0) {
//                    tempSum += j; // Add j to the sum
//                    if (j != i / j) { // Avoid adding the square root twice (when i is a perfect square)
//                        tempSum += i / j; // Add the paired divisor
//                    }
//                }
//            }
//
//            sum += tempSum;  // Add the sum of divisors of i to the total sum
//        }
//
//        return sum;
//    }

    //<------------------------Best Approach-------------------------------------->
    public static int sumOfAllDivisors(int n){
        // Write your code here.
        int sum = 0;
        for (int i = 1; i <=n; i++) {
            sum = sum+(n/i)*i;
        }
        return sum;
    }
}
