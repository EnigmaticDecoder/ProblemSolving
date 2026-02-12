// Last updated: 2/12/2026, 6:56:46 AM
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
       for(int i = 0; i<numRows; i++){
            List<Integer> innerlist = new ArrayList<>();
        for(int j = 0; j<=i; j++){
            innerlist.add(nCr(i,j));
        }
        list.add(innerlist);
       } 
       return list;
    }
    int nCr(int n, int r){
        int res = 1;
        for(int i = 0; i<r; i++){
            res *= (n-i);
            res /=(i+1);
        }
        return res;
    }
}