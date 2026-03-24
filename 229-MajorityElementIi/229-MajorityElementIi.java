// Last updated: 3/24/2026, 2:25:00 PM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        int limit = n/3;
        int num1 = Integer.MIN_VALUE,num2 = Integer.MIN_VALUE,count1 = 0,count2 = 0;
        for(int num : nums){
            if(count1==0 && num2!=num){
                count1 = 1;
                num1 = num;
            }
            else if(count2==0 && num1!=num){
                count2 = 1;
                num2 = num;
            }
            else if(num1==num) count1++;
            else if(num2==num) count2++;
            else {
                count1--;
                count2--;
            }
        }
            count1 = 0;
            count2 = 0;
            for(int num : nums){
                if(num==num1) count1++;
                if(num==num2) count2++;
            }
            if(count1>limit) list.add(num1);
            if(count2>limit) list.add(num2);
            return list;
       }
}
