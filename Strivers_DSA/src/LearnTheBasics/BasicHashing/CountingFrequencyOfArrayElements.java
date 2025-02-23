package LearnTheBasics.BasicHashing;

import java.util.ArrayList;
import java.util.List;

public class CountingFrequencyOfArrayElements {
    public static void main(String[] args) {
        int[] arr = {3,3,3,3,3};
        System.out.println(frequencyCount(arr));
    }
    public static List<Integer> frequencyCount(int[] arr) {
        // do modify in the given array
        int[] hash = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            hash[arr[i]-1]++;
        }
        List<Integer> ls = new ArrayList<>();
        for(int i=0;i<hash.length;i++){
            ls.add(hash[i]);
        }
        return ls;
    }
}
