package ArrayQuestion.Medium;
//https://leetcode.com/problems/two-sum/
//leetcode-1
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
    //<--------------Brute Force Approach---------------------------->
//    public static int[] twoSum(int[] nums, int target) {
//        for(int i=0;i<nums.length;i++){
//            int search = target - nums[i];
//            for(int j=i+1;j<nums.length;j++){
//                if(nums[j]==search){
//                    return new int[] {i,j};
//                }
//            }
//        }
//        return new int[] {-1,-1};
//    }

    //<-------------------Optimal Approach------------------------------>
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int remain = target - nums[i];
            if(mp.containsKey(remain)){
                return new int[] {mp.get(remain), i};
            }
            mp.put(nums[i],i);
        }
        return null;
    }
}
