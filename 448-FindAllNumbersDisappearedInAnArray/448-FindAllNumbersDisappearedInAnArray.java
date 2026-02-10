// Last updated: 2/10/2026, 3:28:06 PM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<n; i++){
            if( nums[Math.abs(nums[i])-1]>0){
                nums[Math.abs(nums[i])-1] *=-1;
            }
        }
        for(int i = 0; i<n; i++){
            if(nums[i]>0) list.add(i+1);
        }
        return list;
    }
}