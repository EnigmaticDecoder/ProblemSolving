// Last updated: 3/24/2026, 2:23:59 PM
class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        Map<Integer, Integer> freq = new TreeMap<>();
        for (int n : nums)
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        
        List<Integer> keys = new ArrayList<>(freq.keySet());
        
        for (int i = 0; i < keys.size(); i++)
            for (int j = i + 1; j < keys.size(); j++) {
                int x = keys.get(i), y = keys.get(j);
                if (!freq.get(x).equals(freq.get(y)))
                    return new int[]{x, y};
            }
        
        return new int[]{-1, -1};
    }
}