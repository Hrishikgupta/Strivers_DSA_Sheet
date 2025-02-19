package LearnTheBasics.LearnBasicRecursion;

public class PrintNto1UsingRecursion {
    public static void main(String[] args) {
        int n = 10;
        printNos(n);
    }
    static void printNos(int N) {
        // code here
        if(N==1){
            System.out.print(N);
            return;
        }
        System.out.print(N+" ");
        printNos(N-1);
    }
}
