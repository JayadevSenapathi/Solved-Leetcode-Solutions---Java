/*  Leetcode Problem : 1672. Richest Customer Wealth
    Leetcode Link : https://leetcode.com/problems/richest-customer-wealth/
    Author : Kota Jayadev Senapathi
    Language Used : Java
    Date : 7th Jan 2021 */

class Solution {
    public int maximumWealth(int[][] accounts) {
        int largest = 0;
        // Add all the 2nd dimentional array elements and search for the largest
        for (int i = 0; i < accounts.length; i++) {
            int wealth = 0;
            for (int j = 0; j < accounts[i].length; j++)
                wealth = wealth + accounts[i][j];
            largest = Math.max(largest, wealth);
        }
        
        return largest;
    }
}