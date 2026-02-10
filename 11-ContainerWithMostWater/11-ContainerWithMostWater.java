// Last updated: 2/10/2026, 3:29:34 PM
class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int start = 0;
        int end = n-1;
        int volume = 0;
        int i = 0;
        while(start<end){
            volume = Math.max(Math.min(height[start],height[end])*(end-start),volume);
            if(height[start]<height[end]) start++;
            else end--;
        }
        return volume;
    }
}