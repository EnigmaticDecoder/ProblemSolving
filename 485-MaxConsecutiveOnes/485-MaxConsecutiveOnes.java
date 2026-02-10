// Last updated: 2/10/2026, 3:28:05 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count =0;
        int instance =0;
        for(int i =0; i<n;i++){
            if(nums[i]==1) {

                instance++;
                count = Math.max(count,instance);
            }else{
                
                instance = 0;
            }

        }
        return count;
    }
}