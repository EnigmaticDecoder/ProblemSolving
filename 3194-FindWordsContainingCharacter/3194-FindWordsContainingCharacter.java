// Last updated: 2/10/2026, 3:27:12 PM
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> order = new ArrayList<Integer>();
        int n = words.length;
        for(int i = 0; i<n; i++){
            if(words[i].contains(String.valueOf(x))) order.add(i);
        }
        return order;
    }
}