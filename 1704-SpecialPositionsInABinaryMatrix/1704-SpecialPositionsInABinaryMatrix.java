// Last updated: 3/24/2026, 2:24:16 PM
class Solution {
    public int numSpecial(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int count = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j]==1){
                    if(check(mat,i,j)) {
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }
    boolean check(int [][] mat, int i, int j){
        int row = mat.length;
        int col = mat[0].length;
        int countC = 0;
        int countR = 0;
        for(int k = 0; k<row; k++){
            if(mat[k][j]==1) countR++;
        }
        for(int k = 0; k<col; k++){
            if(mat[i][k]==1) countC++;
        }
        if(countC>1 || countR>1) return false;
        else return true;
    }
}