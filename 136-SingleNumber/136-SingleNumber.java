// Last updated: 2/10/2026, 3:28:59 PM
class Solution {
    public int singleNumber(int[] nums) {
         int ans = 0;
        for(int num : nums){
            ans ^= num;  
        }
        return ans;
    }
}