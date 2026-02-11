// Last updated: 2/11/2026, 10:05:14 PM
/*
 * Not an optimal solution.
 * We are calling a function multiple times.
*/

1class Solution {
2    public List<List<Integer>> generate(int numRows) {
3        List<List<Integer>> list = new ArrayList<>();
4       for(int i = 0; i<numRows; i++){
5            List<Integer> innerlist = new ArrayList<>();
6        for(int j = 0; j<=i; j++){
7            innerlist.add(nCr(i,j));
8        }
9        list.add(innerlist);
10       } 
11       return list;
12    }
13    int nCr(int n, int r){
14        int res = 1;
15        for(int i = 0; i<r; i++){
16            res *= (n-i);
17            res /=(i+1);
18        }
19        return res;
20    }
21}