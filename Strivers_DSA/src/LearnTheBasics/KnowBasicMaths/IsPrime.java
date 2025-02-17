package LearnTheBasics.KnowBasicMaths;

public class IsPrime {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(isPrime(num));
    }
    public static String isPrime(int num) {
        //Your code goes here
        if(num<=1){
            return "NO";
        }
        int c=2;
        while(c*c<=num){
            if(num%c==0){
                return "NO";
            }
            c++;
        }
        if(c*c>num){
            return "YES";
        }else{
            return "NO";
        }
    }

}
