// Last updated: 2/12/2026, 8:33:21 PM
1class Solution {
2    public int[] rearrangeArray(int[] nums) {
3        int n = nums.length;
4        int[] arr = new int[n];
5        int pidx = 0, nidx=1;
6        for(int i = 0; i<n; i++){
7            if(nums[i]>0){
8                arr[pidx] = nums[i];
9                pidx +=2;
10            }
11            else{
12                arr[nidx] = nums[i];
13                nidx+=2;
14            }
15        }
16        return arr;
17    }
18}