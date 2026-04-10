// Last updated: 4/10/2026, 12:58:23 PM
1class Solution {
2    public int majorityElement(int[] nums) {
3        int n = nums.length;
4        HashMap<Integer,Integer> map = new HashMap<>();
5        for(int num:nums){
6            map.put(num, map.getOrDefault(num,0)+1);
7        }
8        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
9            if(entry.getValue()>(int)n/2) return entry.getKey();
10        }
11        return 0;
12    }
13}