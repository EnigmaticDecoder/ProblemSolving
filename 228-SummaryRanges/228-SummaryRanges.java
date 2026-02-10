// Last updated: 2/10/2026, 3:28:38 PM
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int n = nums.length;
        int j = 0;
        for(int i = 0; i<n; i++){
            if(i==n-1 || (nums[i+1] != (nums[i]+1))){
                String a = Integer.toString(nums[j]);
                String b = Integer.toString(nums[i]);
                if(i==j){
                    list.add(a);
                }
                else{
                    String str = a+"->"+b;
                    list.add(str);
                }
                j = i+1;
            }
        }
        return list;
    }
}