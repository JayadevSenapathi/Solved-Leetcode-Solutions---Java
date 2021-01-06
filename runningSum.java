/* 	Leetcode Problem : 1480. Running Sum of 1d Array
	Leetcode Link : https://leetcode.com/problems/running-sum-of-1d-array/
	Author : Kota Jayadev Senapathi
   	Language Used : Java
   	Date : 7th Jan 2021 */

class Solution {
    public int[] runningSum(int[] nums) {
        int result[] = new int[nums.length];
        int total = 0;
        int current = 0;
        
        // Total sum of Array
        for (int i = 0; i < nums.length; i++) {
            total = total + nums[i];
        }

        current = total;
        result[nums.length - 1] = current;
        
        // Sub the current element from the total(current value)
        for (int i = nums.length - 2; i >= 0; i--) {
            result[i] = current - nums[i + 1];
            current = result[i];
        }
        
        return result;
    }
}