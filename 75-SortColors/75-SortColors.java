// Last updated: 2/10/2026, 3:29:08 PM
class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int[] arr = new int[3];
        for(int i = 0; i < n ; i++){
            if(nums[i]==0) arr[0]++;
            else if(nums[i]==1) arr[1]++;
            else arr[2]++;
        }
        for(int i = 0 ; i< n;i++){
            if(arr[0]!=0){
                nums[i]=0;
                arr[0]--;
            }
            else if(arr[1]!=0){
                nums[i]=1;
                arr[1]--;
            }
            else{
                nums[i]=2;
            }
        }
    }
}