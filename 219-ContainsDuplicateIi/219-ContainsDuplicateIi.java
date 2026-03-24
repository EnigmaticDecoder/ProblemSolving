// Last updated: 3/24/2026, 2:25:02 PM
import java.util.*;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(i > k) {
                set.remove(nums[i - k - 1]);
            }
            if(!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}