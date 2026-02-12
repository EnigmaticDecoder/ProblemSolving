// Last updated: 2/12/2026, 6:50:35 AM
1class Solution {
2    public int thirdMax(int[] nums) {
3        Long max1 = null;
4        Long max2 = null;
5        Long max3 = null;
6        for (int num : nums) {
7                if ((max1 != null && num == max1) ||
8                (max2 != null && num == max2) ||
9                (max3 != null && num == max3)) {
10                continue;
11            }
12            if (max1 == null || num > max1) {
13                max3 = max2;
14                max2 = max1;
15                max1 = (long) num;
16            } 
17            else if (max2 == null || num > max2) {
18                max3 = max2;
19                max2 = (long) num;
20            } 
21            else if (max3 == null || num > max3) {
22                max3 = (long) num;
23            }
24        }
25
26        return max3 == null ? max1.intValue() : max3.intValue();
27    }
28}