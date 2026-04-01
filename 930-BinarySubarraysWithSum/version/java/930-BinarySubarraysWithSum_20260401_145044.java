// Last updated: 4/1/2026, 2:50:44 PM
// Optimised using Prefix Sum and HashMap
1class Solution {
2    public int numSubarraysWithSum(int[] nums, int goal) {
3        int n = nums.length; 
4        int count = 0;
5        int sum = 0;
6        HashMap<Integer,Integer> map = new HashMap<>();
7        map.put(0,1);
8        for(int i = 0; i<n; i++){
9           sum+=nums[i];
10           if(map.containsKey(sum-goal)){
11            count += map.get(sum-goal);
12            map.put(sum, map.getOrDefault(sum,0)+1);
13           }
14           else 
15            map.put(sum, map.getOrDefault(sum,0)+1);
16        }
17        return count;
18    }
19}