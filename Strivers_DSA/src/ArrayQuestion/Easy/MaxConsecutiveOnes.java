package ArrayQuestion.Easy;
//leetcode-485
//https://leetcode.com/problems/max-consecutive-ones/description/
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums={1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for(int num: nums){
            if(num==1){
                count++;
            }
            if(num==0){
                max = Math.max(count,max);
                count=0;
            }
        }
        return Math.max(count,max);
    }
}
