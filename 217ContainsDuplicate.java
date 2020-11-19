class Solution {
    public boolean containsDuplicate(int[] nums) {
        //sort the array first
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            //return when find the same nums
            if(nums[i] == nums[i+1]) return true;
        }
        return false;
    }
}
