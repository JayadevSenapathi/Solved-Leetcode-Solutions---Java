/*  Leetcode Problem : 1365. How Many Numbers Are Smaller Than the Current Number
    Leetcode Link : https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
    Author : Kota Jayadev Senapathi
    Language Used : Java
    Date : 7th Jan 2021 */

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] temp = nums.clone();
        Arrays.sort(temp);
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < temp.length; j++) {
                if (temp[j] < nums[i]) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}