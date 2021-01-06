/*  Leetcode Problem : 1512. Number of Good Pairs
    Leetcode Link : https://leetcode.com/problems/number-of-good-pairs/
    Author : Kota Jayadev Senapathi
    Language Used : Java
    Date : 7th Jan 2021 */

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length - 1; i++)
            for (int j = i + 1; j < nums.length; j++)
                if (nums[i] == nums[j] && i < j)
                    result++;
        return result;
    }
}