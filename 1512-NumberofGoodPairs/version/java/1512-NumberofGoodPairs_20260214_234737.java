// Last updated: 2/14/2026, 11:47:37 PM
1class Solution {
2    public int numIdenticalPairs(int[] nums) {
3        int count = 0;
4        for (int i = 0; i < nums.length; i++) {
5            for (int j = i + 1; j < nums.length; j++) {
6                if (nums[i] == nums[j]) {
7                    count++;
8                }
9            }
10        }
11        return count;
12    }
13}