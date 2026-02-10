// Last updated: 2/10/2026, 3:27:34 PM
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int len = num.length - 1;
    
         while (len >= 0 || k != 0) {
            if (len >= 0) {
                k += num[len];
                len--;
               }
               list.add(k % 10);
               k /= 10;
            }
             Collections.reverse(list);
             return list; 
    }
}