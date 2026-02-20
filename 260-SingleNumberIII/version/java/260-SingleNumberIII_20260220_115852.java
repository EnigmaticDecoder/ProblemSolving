// Last updated: 2/20/2026, 11:58:52 AM
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n = nums.length;
4        int product = 1;
5        int answer[] = new int[n];
6        int count = 0;
7        for(int num : nums){
8            product = (num==0)? product : product*num;
9            if(num==0) count++;
10        }
11        for(int i = 0; i<n; i++){
12            if(count==1) {
13                answer[i] = (nums[i]==0)? product : 0;
14            }else if(count>1)
15                {
16                    answer[i] = 0;
17                    }
18                    else answer[i] = product/nums[i];
19        }
20        return answer;
21    }
22}