// Last updated: 2/19/2026, 10:39:54 AM
1class Solution {
2    public boolean isHappy(int n) {
3        int slow = n;
4        int fast = n;
5        do{
6            slow = getSum(slow);
7            fast = getSum(getSum(fast));
8        }while(fast!=1 && fast!=slow);
9        return fast == 1;
10    }
11    public int getSum(int num){
12        int sum = 0;
13        while(num>0){
14            int digit = num%10;
15            sum += digit*digit;
16            num/=10;
17        }
18        return sum;
19    }
20}