package LearnTheBasics.KnowBasicMaths;
import java.util.*;
public class ArmStrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checkArmStrong(n));
    }
    static boolean checkArmStrong(int num){
        int len = Integer.toString(num).length();
        int temp = num;
        int res = 0;
        while(temp>0){
            int rem = temp % 10;
            res = res + (int)Math.pow(rem,len);
            temp = temp/10;
        }
        return (res == num);
    }

}
