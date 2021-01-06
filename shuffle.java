/*  Leetcode Problem : 1470. Shuffle the Array
    Leetcode Link : https://leetcode.com/problems/shuffle-the-array/
    Author : Kota Jayadev Senapathi
    Language Used : Java
    Date : 7th Jan 2021 */

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int current = 0;
        
        // ith element is ith element of nums, ith + 1 element is (ith + n) element of nums.
        for (int i = 0; i < n * 2; i = i + 2) {
            result[i] = nums[current];
            result[i + 1] = nums[n + current];
            current++;
        }
        return result;
    }
}