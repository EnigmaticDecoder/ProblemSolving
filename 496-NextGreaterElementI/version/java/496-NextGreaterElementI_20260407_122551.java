// Last updated: 4/7/2026, 12:25:51 PM
1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3        int n = nums1.length;
4        int m = nums2.length;
5        int [] res = new int[n];
6        for(int i = 0; i<n; i++){
7            int idx = -1;
8            int j = 0;
9            for(; j<m; j++){
10                if(nums1[i]==nums2[j]) break;
11            }
12
13            for(; j<m; j++){
14                if(nums2[j]>nums1[i]){
15                    idx = nums2[j];
16                    break;
17                }
18            }
19            res[i] = idx;
20        }
21        return res;
22    }
23}