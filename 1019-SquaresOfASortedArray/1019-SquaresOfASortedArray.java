// Last updated: 2/10/2026, 3:27:36 PM
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int ans[] = new int [n];
        int l = 0;
        int r = n-1;
        while(l<=r){
            int left = nums[l]*nums[l];
            int right = nums[r]*nums[r];
            if(left<right){
                ans[--n] = right;
                r--;
            }
            else{
                ans[--n] = left;
                l++;
            }
            }
        return ans;

        }
    }
