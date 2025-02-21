package LearnTheBasics.LearnBasicRecursion;
//https://www.geeksforgeeks.org/problems/find-all-factorial-numbers-less-than-or-equal-to-n3548/0?problemType=functional&difficulty%255B%255D=-1&page=1&query=problemTypefunctionaldifficulty%255B%255D-1page1
import java.util.ArrayList;

public class FactorialOfNNumbers {
    public static void main(String[] args) {
        System.out.println(factorialNumbers(9));
    }
    static ArrayList<Long> factorialNumbers(long n) {
        // code here
        ArrayList<Long> ls = new ArrayList<>();
        long i=1;
        while(factorial(i)<=n){
            ls.add(factorial(i));
            i++;
        }
        return ls;
    }
    static long factorial(long n){
        if(n==0){
            return 1;
        }
        return factorial(n-1)*n;
    }
}
