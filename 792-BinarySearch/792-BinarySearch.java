// Last updated: 2/10/2026, 3:27:47 PM
class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int right  = n-1;
        int left = 0;
        while(right>=left){
            int mid = right + (left - right)/2;
            if(nums[mid]== target)
            return mid;
            else if(nums[mid]>target)
            right = mid-1;
            else
            left = mid+1;
                    }
                    return -1;
    }
}