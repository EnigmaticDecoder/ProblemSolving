// Last updated: 3/24/2026, 2:24:22 PM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = 0;
        for(int num : candies){
            if(num>max) max = num;
        }
        for(int num : candies){
            if((num+extraCandies)>=max) list.add(true);
            else list.add(false);
        }
        return list;
    }
}