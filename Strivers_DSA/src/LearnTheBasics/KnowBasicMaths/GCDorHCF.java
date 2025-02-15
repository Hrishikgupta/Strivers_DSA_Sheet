package LearnTheBasics.KnowBasicMaths;

import java.util.Arrays;

public class GCDorHCF {
    public static void main(String[] args) {
        int a= 5,b=10;
        System.out.println(Arrays.toString(lcmAndGcd(a,b)));
    }
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        //int[] res = new int[2];
        int temp1 = a;
        int temp2 = b;
        while(temp1 != temp2){
            if(temp1>temp2){
                temp1 = temp1-temp2;
            }else{
                temp2 = temp2-temp1;
            }
        }
        return new int[] {(a*b)/temp1,temp1};
    }
}
