// Last updated: 3/24/2026, 2:23:58 PM
class Solution {
    public int firstUniqueEven(int[] nums) {
       HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (n % 2 == 0) {
                map.put(n, map.getOrDefault(n, 0) + 1);
            }
        }
        for (int n : nums) {
            if (n % 2 == 0 && map.get(n) == 1) {
                return n;
            }
        }
        return -1;
    }
}