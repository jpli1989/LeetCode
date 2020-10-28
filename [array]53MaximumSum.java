class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0], sum = 0;
        for(int num : nums){
            sum = Math.max(sum + num, num); // compare the sum value with the num, and get the bigger value
            max = Math.max(sum, max); //compare the cur max with sum value and get the bigger value
        }
        
        return max;
    }
}
