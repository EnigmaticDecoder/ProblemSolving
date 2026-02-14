// Last updated: 2/14/2026, 11:52:28 PM
// We just have to check the for edge case(nums2) having extra element
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        int i = m - 1;
4        int j = n - 1;
5        int k = m + n - 1;
6        while (i >= 0 && j >= 0) {
7            if (nums1[i] > nums2[j]) {
8                nums1[k--] = nums1[i--];
9            } else {
10                nums1[k--] = nums2[j--];
11            }
12        }
13        while (j >= 0) {
14            nums1[k--] = nums2[j--];
15        }
16    }
17}