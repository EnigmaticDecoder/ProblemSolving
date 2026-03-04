// Last updated: 3/4/2026, 2:42:16 PM
1class Solution {
2    public int numSpecial(int[][] mat) {
3        int m = mat.length;
4        int n = mat[0].length;
5        int count = 0;
6        for(int i=0; i<m; i++){
7            for(int j=0; j<n; j++){
8                if(mat[i][j]==1){
9                    if(check(mat,i,j)) {
10                        count++;
11                        break;
12                    }
13                }
14            }
15        }
16        return count;
17    }
18    boolean check(int [][] mat, int i, int j){
19        int row = mat.length;
20        int col = mat[0].length;
21        int countC = 0;
22        int countR = 0;
23        for(int k = 0; k<row; k++){
24            if(mat[k][j]==1) countR++;
25        }
26        for(int k = 0; k<col; k++){
27            if(mat[i][k]==1) countC++;
28        }
29        if(countC>1 || countR>1) return false;
30        else return true;
31    }
32}