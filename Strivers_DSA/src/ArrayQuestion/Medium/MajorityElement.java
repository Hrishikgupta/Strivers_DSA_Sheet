package ArrayQuestion.Medium;
//https://leetcode.com/problems/majority-element/description/
//https://www.naukri.com/code360/problems/majority-element_6783241?leftPanelTabValue=PROBLEM
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int num: nums){
            if(mp.containsKey(num)){
                mp.put(num,mp.get(num)+1);
            }else{
                mp.put(num,1);
            }
        }
        int max = -1;
        int ans = -1;
        for(Map.Entry<Integer,Integer> mp1 : mp.entrySet()){
            int val = mp1.getValue();
            if(val>max){
                max = val;
                ans = mp1.getKey();
            }
        }
        return ans;
    }
}
