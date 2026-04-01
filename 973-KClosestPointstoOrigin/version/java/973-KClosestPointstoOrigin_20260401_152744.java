// Last updated: 4/1/2026, 3:27:44 PM
1class Solution {
2    public int[][] kClosest(int[][] points, int k) {
3        int n = points.length;
4        double arr[] = new double[n];
5        double sort[] = new double[n];
6        int ans[][] = new int[k][2];
7        for(int i = 0; i<n; i++){
8            arr[i] = Math.sqrt(points[i][0]*points[i][0] + points[i][1]*points[i][1]);
9            sort[i] = arr[i];
10        }
11        Arrays.sort(sort);
12        double value = sort[k-1];
13        int j = 0;
14        for(int i = 0; i<n; i++){
15            if(arr[i]<=value) {
16                ans[j][0] = points[i][0];
17                ans[j++][1] = points[i][1];
18            }
19        }
20        return ans;
21    }
22}