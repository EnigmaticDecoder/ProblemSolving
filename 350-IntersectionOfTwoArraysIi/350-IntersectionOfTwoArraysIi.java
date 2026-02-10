// Last updated: 2/10/2026, 3:28:22 PM
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] array = new int[Math.min(nums1.length, nums2.length)];
        int idx = 0;
        for(int i = 0, j=0; i<nums1.length && j<nums2.length;){
            if(nums1[i] == nums2[j]) {array[idx++] = nums1[i]; i++; j++;}
            else if(nums1[i]>nums2[j]) j++;
            else i++;
        }
        return Arrays.copyOf(array,idx);
    }
}