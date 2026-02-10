// Last updated: 2/10/2026, 3:28:12 PM
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<String>();
        for(int i = 1; i<=n; i++){
            if((i%3 == 0) && (i%5 == 0)) ans.add("FizzBuzz");
            else if(i%3 == 0) ans.add("Fizz");
            else if(i%5 == 0) ans.add("Buzz");
            else ans.add(String.valueOf(i));
        }
        return ans;
    }
}