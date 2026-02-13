// Last updated: 2/13/2026, 10:11:06 AM
// Not optimal
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3        int n = nums.length;
4        int min = Integer.MAX_VALUE;
5        Set<Integer> set = new HashSet<>();
6        for(int num: nums){
7            if(num>=0) set.add(num);
8        }
9        boolean flag = true;
10        for(int i = 1; i<=Integer.MAX_VALUE; i++){
11            if(!set.contains(i)) return i;
12        }
13        return 0;
14    }
15}