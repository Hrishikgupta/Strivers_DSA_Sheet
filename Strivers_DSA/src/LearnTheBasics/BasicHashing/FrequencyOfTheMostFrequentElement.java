package LearnTheBasics.BasicHashing;

import java.util.Arrays;

public class FrequencyOfTheMostFrequentElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,8,9,9,9,10,10};
        int k = 3;
        System.out.println(maxFrequency(nums,k));
    }
    public static int maxFrequency(int[] nums, int k) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int count = 0;
        int max = nums[nums.length-1];
        for(int i=nums.length-1;i>=0;i--){
            if(max-nums[i]==0){
                count++;
            } else if (max-nums[i]<=k) {
                k = k - (max-nums[i]);
                count++;
            }
        }
        return count;
    }
}
