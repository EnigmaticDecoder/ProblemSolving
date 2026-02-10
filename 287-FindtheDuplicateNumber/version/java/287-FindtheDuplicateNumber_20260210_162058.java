// Last updated: 2/10/2026, 4:20:58 PM
// Optimal code
1class Solution {
2    public int findDuplicate(int[] nums) {
3        int slow = 0;
4        int fast = 0;
5        slow = nums[slow];
6        fast = nums[nums[fast]];
7        while (slow != fast){
8            slow = nums[slow];
9            fast = nums[nums[fast]];
10        } 
11        slow = 0;
12        while (slow != fast) {
13            slow = nums[slow];
14            fast = nums[fast];
15        }
16
17        return slow;
18    }
19}