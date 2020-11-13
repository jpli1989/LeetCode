/* 
   Use bit manipulation
   0 ^ 0 = 0
   1 ^ 1 = 0
   0 ^ 1 = 1
   1 ^ 0 = 1
   Because every elements appear twice except for one, so will left only one element and return it
   
   ** at first, i try to use hashset, but runtime is 8s.
*/

class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
             ans = ans ^ nums[i];
        }
        return ans;
    }
}
