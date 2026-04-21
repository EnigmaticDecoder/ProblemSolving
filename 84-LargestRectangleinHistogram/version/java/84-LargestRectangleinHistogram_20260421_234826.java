// Last updated: 4/21/2026, 11:48:26 PM
1class Solution {
2    public int largestRectangleArea(int[] heights) {
3        int n = heights.length;
4        if (heights == null || n == 0) return 0;
5        Stack<Integer> stack = new Stack<>();
6        int maxArea = 0;
7        for (int i = 0; i <= n; i++) {
8            int h = (i == n) ? 0 : heights[i];
9            while (!stack.isEmpty() && h < heights[stack.peek()]) {
10                int hgt = heights[stack.pop()];
11                int right = i;
12                int left = stack.isEmpty() ? -1 : stack.peek();
13                int width = right - left - 1;
14                maxArea = Math.max(maxArea, hgt * width);
15            }
16            stack.push(i);
17        }
18
19        return maxArea;
20    }
21}