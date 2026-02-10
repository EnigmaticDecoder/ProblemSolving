// Last updated: 2/10/2026, 3:27:39 PM
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        int boats = 0;

        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++; 
            }
            right--; 
            boats++;
        }
        return boats;
    }
}