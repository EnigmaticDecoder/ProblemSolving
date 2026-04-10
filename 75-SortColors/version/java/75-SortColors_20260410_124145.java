// Last updated: 4/10/2026, 12:41:45 PM
1class Solution {
2    public void sortColors(int[] nums) {
3        int n = nums.length;
4        int low = 0, mid = 0, high = n-1;
5        while(mid<=high)
6            if(nums[mid]==0){
7                int temp = nums[mid];
8                nums[mid] = nums[low];
9                nums[low] = temp;
10                low++;mid++;
11            }else if(nums[mid]==1){
12                mid++;
13            }else{
14                int temp = nums[mid];
15                nums[mid] = nums[high];
16                nums[high] = temp;
17                high--;
18            }
19    }
20}
21
22