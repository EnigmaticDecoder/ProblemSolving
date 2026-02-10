// Last updated: 2/10/2026, 3:27:16 PM
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int sumleft[] = new int[n];
        int sumright[] = new int[n];
        int answer[] = new int[n];
        int sumL = 0;
        int sumR = 0;
        for(int i = 0; i<n; i++){
            sumleft[i] = sumL;
            sumright[n-i-1] = sumR;
            sumL += nums[i];
            sumR += nums[n-i-1];
        }
        for(int i = 0; i<n; i++){
            answer[i] = Math.abs(sumleft[i]-sumright[i]);
        }
        return answer;
    }
}