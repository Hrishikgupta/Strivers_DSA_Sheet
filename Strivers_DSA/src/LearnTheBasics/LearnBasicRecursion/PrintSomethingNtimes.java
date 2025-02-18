package LearnTheBasics.LearnBasicRecursion;
//Without loops
public class PrintSomethingNtimes {
    public static void main(String[] args) {
        int n = 10;
        printNos(n);

    }public static void printNos(int n) {
        // Your code here
        print(1,n);

    }
    static int print(int i, int n){
        if(i>n){
            //System.out.println(n);
            return 0;
        }
        System.out.print(i+" ");
        return print(i+1,n);
    }
}
