// Last updated: 3/24/2026, 2:24:21 PM
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int n = nums.length;
        int counter = n+1;
        for(int i = 0; i<n; i++){
            if(nums[i]==1){
                if(counter<k){
                    return false;
                } 
                counter = 0;
            }
            else counter++;
        }
    return true;
        
    }
}