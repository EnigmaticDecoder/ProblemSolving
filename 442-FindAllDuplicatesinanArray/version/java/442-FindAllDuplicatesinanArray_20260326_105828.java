// Last updated: 3/26/2026, 10:58:28 AM
1class Solution {
2    public int[] findErrorNums(int[] nums) {
3        int n = nums.length;
4        int duplicate = 0;
5        int sum = 0;
6        HashSet<Integer> set = new HashSet<>();
7        for(int num : nums){
8            sum+=num;
9            if(!set.add(num)) duplicate = num;
10        }
11        sum-=duplicate;
12        int missing = n*(n+1)/2 - sum;
13        return new int[]{duplicate, missing};
14
15    }
16}