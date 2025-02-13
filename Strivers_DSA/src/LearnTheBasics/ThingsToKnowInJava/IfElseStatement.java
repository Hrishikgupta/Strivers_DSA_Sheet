package LearnTheBasics.ThingsToKnowInJava;

import java.sql.SQLOutput;

public class IfElseStatement {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        System.out.println(compareNM(n,m));
    }
    public static String compareNM(int n, int m) {
        // code here
        if(n<m){
            return "lesser";
        }else if(n==m){
            return "equal";
        }
        return "greater";
    }
}
