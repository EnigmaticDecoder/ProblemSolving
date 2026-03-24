// Last updated: 3/24/2026, 2:24:57 PM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int product = 1;
        int answer[] = new int[n];
        int count = 0;
        for(int num : nums){
            product = (num==0)? product : product*num;
            if(num==0) count++;
        }
        for(int i = 0; i<n; i++){
            if(count==1) {
                answer[i] = (nums[i]==0)? product : 0;
            }else if(count>1)
                {
                    answer[i] = 0;
                    }
                    else answer[i] = product/nums[i];
        }
        return answer;
    }
}