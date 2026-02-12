// Last updated: 2/12/2026, 11:00:16 AM
1class Solution {
2    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
3        List<Boolean> list = new ArrayList<>();
4        int max = 0;
5        for(int num : candies){
6            if(num>max) max = num;
7        }
8        for(int num : candies){
9            if((num+extraCandies)>=max) list.add(true);
10            else list.add(false);
11        }
12        return list;
13    }
14}