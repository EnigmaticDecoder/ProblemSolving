// Last updated: 2/10/2026, 3:27:33 PM
class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int maxrt = -1;
        for(int i = n-1; i>=0;i--){
            int temp = arr[i];
            arr[i] = maxrt;
            maxrt = Math.max(maxrt,temp);
        }
        return arr;
    }
}