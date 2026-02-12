// Last updated: 2/12/2026, 6:55:17 AM
// We are using long because initialising the max with IntegerMIN would fail the constraint and test case.
1class Solution {
2    public int thirdMax(int[] nums) { 
3        long max1 = Long.MIN_VALUE;
4        long max2 = Long.MIN_VALUE;
5        long max3 = Long.MIN_VALUE;
6        for(int num : nums){
7            if(num>max1){
8                max3 = max2;
9                max2 = max1;
10                max1 = num;
11            }
12            else if(num>max2 && num<max1){
13                max3 = max2;
14                max2 = num;
15            }
16            else if(num>max3 && num<max2){
17                max3 = num;
18            }
19        } 
20        if(max3 != Long.MIN_VALUE){
21            return (int) max3;
22        }
23        else{
24            return (int) max1;
25        }
26    }
27}