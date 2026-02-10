// Last updated: 2/10/2026, 3:29:19 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int p = 0;
        int q = n-1;
        int [] arr = {-1,-1};
        while(p<=q){
            int mid = p +(q-p)/2;
            if(nums[mid] == target){
                arr[0] = mid;
                q = mid-1;
            }
            else if(nums[mid]<target) p = mid+1;
            else q = mid-1;
        }
        p = 0;
        q = n-1;
        while(p<=q){
            int mid = p +(q-p)/2;
            if(nums[mid] == target){
                arr[1] = mid;
                p = mid+1;
            }
            else if(nums[mid]<target) p = mid+1;
            else q = mid-1;
        }
        
        return arr;
    }
}