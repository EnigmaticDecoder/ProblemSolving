// Last updated: 4/21/2026, 11:50:40 PM
1class Solution {
2    public int largestRectangleArea(int[] heights) {
3        int n = heights.length;
4        if (heights == null || n == 0) return 0;
5        Deque<Integer> stack = new ArrayDeque<>();
6        int maxArea = 0;
7        for (int i = 0; i <= n; i++) {
8            int h = (i == n) ? 0 : heights[i];
9            while (!stack.isEmpty() && h < heights[stack.peek()]) {
10                int barHeight = heights[stack.pop()];
11                int rightBoundary = i;
12                int leftBoundary = stack.isEmpty() ? -1 : stack.peek();
13                int width = rightBoundary - leftBoundary - 1;
14                maxArea = Math.max(maxArea, barHeight * width);
15            }
16            stack.push(i);
17        }
18        return maxArea;
19    }
20}