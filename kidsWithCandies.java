/*  Leetcode Problem : 1431. Kids With the Greatest Number of Candies
    Leetcode Link : https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
    Author : Kota Jayadev Senapathi
    Language Used : Java
    Date : 7th Jan 2021 */

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int largest = 0;

        // find the largest candy
        for (int candy : candies)
            largest = Math.max(largest, candy);
        List<Boolean> result = new ArrayList<Boolean>();

        // check if the current candy >= largest candy
        for (int i = 0; i < candies.length; i++) {
            result.add(candies[i] + extraCandies >= largest);
        }
        return result;
    }
}