package ArrayQuestion.Medium;

import java.util.Arrays;

//Sort an array of 0's , 1's and 2's
//leetcode-75
//https://leetcode.com/problems/sort-colors/description/
public class SortAnArrayOf0s1sand2s {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);

    }
    public static void sortColors(int[] nums) {
        int count_0 = 0;
        int count_1 = 0;
        int count_2 = 0;
        for(int num : nums){
            if(num==0){
                count_0++;
            }else if(num==1){
                count_1++;
            }else {
                count_2++;
            }
        }
        int i=0;
        while(count_0!=0 && i<nums.length){
            nums[i]=0;
            count_0--;
            i++;
        }
        while(count_1 != 0 && i<nums.length){
            nums[i] = 1;
            count_1--;
            i++;
        }
        while(count_2!=0 && i<nums.length){
            nums[i]=2;
            count_2--;
            i++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
