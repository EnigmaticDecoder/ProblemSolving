// Last updated: 4/1/2026, 11:57:35 AM
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        int n = nums.length;
4        int count = 0; 
5        int sum = 0;
6        HashMap<Integer,Integer> map = new HashMap<>();
7        map.put(0,1);
8        for(int i = 0; i<n; i++){
9           sum+=nums[i];
10           if(map.containsKey(sum-k)){
11            count += map.get(sum-k);
12            map.put(sum, map.getOrDefault(sum, 0) + 1);
13           }
14           else 
15            map.put(sum, map.getOrDefault(sum, 0) + 1);
16
17        }
18        return count;
19    }
20}