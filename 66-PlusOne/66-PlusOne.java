// Last updated: 2/10/2026, 3:29:13 PM
class Solution {
    public int[] plusOne(int[] digits) {
        boolean condition = false;
        int end = digits.length-1; 
          if(digits[end] != 9){
            digits[end] += 1;
            return digits;
          }else{
            for(int i = end; i>=0; i--){
                if(digits[i] == 9){
                    digits[i] = 0;
                    if(i == 0){
                        condition = true;
                    }
                }else{
                    digits[i] += 1;
                    return digits;
                }
            }
          }
          int arr[] = new int[end+2];
          arr[0] = 1;
          if(condition){
            for(int i = 1; i<arr.length; i++){
                arr[i] = digits[i-1];
            }
          }
          return arr;
    }
}