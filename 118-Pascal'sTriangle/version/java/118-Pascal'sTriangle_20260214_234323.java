// Last updated: 2/14/2026, 11:43:23 PM
1class Solution {
2    public List<List<Integer>> generate(int numRows) {
3        List<List<Integer>> triangle = new ArrayList<>();    
4        for (int i = 0; i < numRows; i++) {
5            List<Integer> row = new ArrayList<>();
6            for (int j = 0; j <= i; j++) {
7                if (j == 0 || j == i) {
8                    row.add(1);
9                } else {
10                    row.add(triangle.get(i - 1).get(j - 1) + 
11                            triangle.get(i - 1).get(j));
12                }
13            }
14            triangle.add(row);
15        }  
16        return triangle;
17    }
18}