// Last updated: 3/9/2026, 10:27:43 PM
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        int n = nums.length;
4        int sum = 0;
5        double avg = 0;
6        int j = 0;
7        for(int i = 0; i<n; i++){
8            if(i<k){
9                sum+=nums[i];
10                avg = (double)sum/k;
11                continue;
12            }
13            sum-=nums[j];
14            sum+=nums[i];
15            j++;
16            if(avg < (double)sum/k){
17                avg = (double)sum/k;
18            }
19        }
20        return avg;
21    }
22}