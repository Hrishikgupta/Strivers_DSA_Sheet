package LearnTheBasics.KnowBasicMaths;
//https://www.naukri.com/code360/problems/count-digits_8416387
public class CountDigits {
    public static void main(String[] args) {
        int n = 336;
        System.out.println(countDigits(n));
    }
    public static int countDigits(int n){
        // Write your code here.
        int temp = n;
        int count = 0;
        while(temp>0){
            int digit = temp%10;
            if(digit != 0 && n%digit==0){
                count++;
            }
            temp=temp/10;
        }
        return count;
    }

}
