// Last updated: 2/10/2026, 3:29:25 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0; 
        for (int j = 1; j < nums.length; j++) { 
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j]; 
            }
        }

        return i + 1; 
    }
}