// Last updated: 2/10/2026, 3:28:51 PM
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int majority = nums[0];
        int voting = 1;
        for(int i = 1; i<n; i++){
            if(nums[i]==majority){
                voting++;
            }
            else if(voting==0){
                majority=nums[i];
                voting++;
            }else voting--;
        }return majority;
    }
}