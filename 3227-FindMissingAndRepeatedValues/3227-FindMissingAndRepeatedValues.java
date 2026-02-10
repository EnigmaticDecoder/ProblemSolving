// Last updated: 2/10/2026, 3:27:10 PM
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> set = new HashSet<>();
        int n = grid.length;
        int [] ans = {0,0};
        int sum = 0;
        int j=0,k=0;
        for(int i = 1; i<=n*n; i++){
            if(!set.add(grid[j][k])) {ans[0] = grid[j][k]; k++;
            }
            else {sum+= grid[j][k]; k++;
            }
            if(i%n==0){
                j++;
                k=0;
            }
        }
        ans[1] = (n*n*(n*n+1)/2)-sum;
        return ans;
    }
}