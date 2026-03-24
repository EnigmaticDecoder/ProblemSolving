// Last updated: 3/24/2026, 2:23:54 PM
class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int n = capacity.length;
        int result = 101;
        int j = 0;
        for(int i = 0; i<n; i++){
            if(capacity[i]>=itemSize && capacity[i]<result){
                result = capacity[i];
                j = i;
            }
        }
        if(result == 101) return -1;
        else return j;
    }
}