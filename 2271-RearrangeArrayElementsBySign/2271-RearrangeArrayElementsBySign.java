// Last updated: 3/24/2026, 2:24:10 PM
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int pidx = 0, nidx=1;
        for(int i = 0; i<n; i++){
            if(nums[i]>0){
                arr[pidx] = nums[i];
                pidx +=2;
            }
            else{
                arr[nidx] = nums[i];
                nidx+=2;
            }
        }
        return arr;
    }
}