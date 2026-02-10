// Last updated: 2/10/2026, 3:27:43 PM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = getMaxPile(piles);

        while (left < right) {
            int mid = left + (right - left) / 2;
            int hoursNeeded = computeHours(piles, mid);

            if (hoursNeeded > h) {
                left = mid + 1; // need more speed
            } else {
                right = mid; // try smaller speed
            }
        }

        return left;
    }

    private int computeHours(int[] piles, int k) {
        int hours = 0;
        for (int pile : piles) {
            hours += (pile + k - 1) / k; // same as ceil(pile / k)
        }
        return hours;
    }

    private int getMaxPile(int[] piles) {
        int max = 0;
        for (int pile : piles) {
            if (pile > max) max = pile;
        }
        return max;
    }
}
