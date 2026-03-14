// Last updated: 3/14/2026, 8:49:25 PM
1class Solution {
2    public int firstUniqueEven(int[] nums) {
3       HashMap<Integer, Integer> map = new HashMap<>();
4        for (int n : nums) {
5            if (n % 2 == 0) {
6                map.put(n, map.getOrDefault(n, 0) + 1);
7            }
8        }
9        for (int n : nums) {
10            if (n % 2 == 0 && map.get(n) == 1) {
11                return n;
12            }
13        }
14        return -1;
15    }
16}