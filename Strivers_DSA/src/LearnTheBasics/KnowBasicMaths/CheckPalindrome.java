package LearnTheBasics.KnowBasicMaths;
//https://www.naukri.com/code360/problems/palindrome-number_624662?leftPanelTabValue=SUBMISSION
//https://leetcode.com/problems/palindrome-number/description/
public class CheckPalindrome {
    public static void main(String[] args) {
        int n = 52125;
        System.out.println(palindromeNumber(n));
    }
    public static boolean palindromeNumber(int n){
        // Write your code here.
        int temp = n;
        int res = 0;
        while(temp>0){
            int rem = temp%10;
            res = (res * 10)+rem;
            temp= temp/10;
        }

        return (n==res);
    }
}
