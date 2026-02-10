// Last updated: 2/10/2026, 3:29:42 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numToIndex = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
        int complement = target - nums[i];
        if (numToIndex.containsKey(complement)) {
            return new int[]{i,numToIndex.get(complement)};
        }
        numToIndex.put(nums[i], i);
        }
        return null;
    }
}
