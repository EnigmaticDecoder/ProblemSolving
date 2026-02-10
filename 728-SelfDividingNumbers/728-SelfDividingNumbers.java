// Last updated: 2/10/2026, 3:27:52 PM
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int num = left; num <= right; num++) {
            if (isSelfDividing(num)) res.add(num);
        }
        return res;
    }

    private boolean isSelfDividing(int num) {
        int n = num;
        while (n > 0) {
            int digit = n % 10;
            if (digit == 0 || num % digit != 0) return false;
            n /= 10;
        }
        return true;
    }
}