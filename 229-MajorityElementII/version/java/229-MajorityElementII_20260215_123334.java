// Last updated: 2/15/2026, 12:33:34 PM
/*
 * We are initialising the num1 and num2 with int min because it would not be in testcase array and falsely trigger the second element
 * testcase like[0,0,0] would return output [0,0] when it should have been [0]
 * you could take a set but that would increase space more.
*/

1class Solution {
2    public List<Integer> majorityElement(int[] nums) {
3        List<Integer> list = new ArrayList<>();
4        int n = nums.length;
5        int limit = n/3;
6        int num1 = Integer.MIN_VALUE,num2 = Integer.MIN_VALUE,count1 = 0,count2 = 0;
7        for(int num : nums){
8            if(count1==0 && num2!=num){
9                count1 = 1;
10                num1 = num;
11            }
12            else if(count2==0 && num1!=num){
13                count2 = 1;
14                num2 = num;
15            }
16            else if(num1==num) count1++;
17            else if(num2==num) count2++;
18            else {
19                count1--;
20                count2--;
21            }
22        }
23            count1 = 0;
24            count2 = 0;
25            for(int num : nums){
26                if(num==num1) count1++;
27                if(num==num2) count2++;
28            }
29            if(count1>limit) list.add(num1);
30            if(count2>limit) list.add(num2);
31            return list;
32       }
33}
34