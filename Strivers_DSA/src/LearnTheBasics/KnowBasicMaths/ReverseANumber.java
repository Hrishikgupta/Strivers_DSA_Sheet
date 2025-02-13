package LearnTheBasics.KnowBasicMaths;

import java.util.Arrays;

//https://www.naukri.com/code360/problems/reverse-bits_2181102?leftPanelTabValue=PROBLEM
//https://leetcode.com/problems/reverse-integer/
public class ReverseANumber {
    public static void main(String[] args) {
        long n = 12;
        //System.out.println(reverseBits(n));   //for Code360
        System.out.println(reverse((int)n));    //for leetcode
    }
//    public static long reverseBits(long n) {
//        // Write your code here
//        long result = 0;
//
//        // We loop through all 32 bits
//        for (int i = 0; i < 32; i++) {
//            // Shift result left by 1 to make space for the new bit
//            result <<= 1;
//
//            // Get the current bit of n and add it to the result
//            result |= (n & 1);
//
//            // Shift n to the right to process the next bit
//            n >>= 1;
//        }
//
//        return result;
//    }

    public static int reverse(int x) {
        int res = 0;
        int sign = (x<0)? -1:1;
        x = Math.abs(x);
        while(x!=0){
            int digit = x%10;
            x=x/10;
            if(res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE/10 && digit > Integer.MAX_VALUE % 10)){
                return 0;
            }
            if(res < Integer.MIN_VALUE/10 || (res == Integer.MIN_VALUE/10 && digit < Integer.MIN_VALUE % 10)){
                return 0;
            }
            res = res * 10 + digit;
        }
        return res * sign;
    }
}
