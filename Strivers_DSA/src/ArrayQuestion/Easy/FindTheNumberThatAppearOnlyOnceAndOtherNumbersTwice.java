package ArrayQuestion.Easy;
//https://www.naukri.com/code360/problems/find-the-single-element_6680465?leftPanelTabValue=PROBLEM
//leetcode-136
//https://leetcode.com/problems/single-number/description/
public class FindTheNumberThatAppearOnlyOnceAndOtherNumbersTwice {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3};
        System.out.println(getSingleElement(nums));
    }
    public static int getSingleElement(int []arr){
        // Write your code here.
        int ans = 0;
        for(int num: arr){
            ans ^= num;
        }
        return ans;
    }
}
