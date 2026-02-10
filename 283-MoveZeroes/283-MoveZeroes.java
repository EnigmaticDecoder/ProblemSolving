// Last updated: 2/10/2026, 3:28:28 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        while(j<n){
            if(nums[i]==0&&nums[j]==0){
                j++;
            }
            else if(nums[i]==0&&nums[j]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
            else {
                i++;
                j++;
            }
        }
    }
}