// Last updated: 3/24/2026, 2:24:33 PM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
         int nJ = jewels.length();
        int nS = stones.length();
        int count = 0;
        for(int i = 0; i<nJ; i++){
            for(int j = 0; j<nS; j++){
                if(jewels.charAt(i) == stones.charAt(j)) count++;
            }
        }
        return count;
    }
}