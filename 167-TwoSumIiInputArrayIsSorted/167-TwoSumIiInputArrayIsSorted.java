// Last updated: 2/10/2026, 3:28:54 PM
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length-1;
        int sum = 0;
        int [] arr = new int[2];
        while(l<r){
            sum = numbers[l]+numbers[r];
            if(target == sum){
                arr[0] = l+1;
                arr[1] = r+1;
                break;
            }
            else if(target>sum) l++;
            else r--;
        }
        return arr;
    }
}