class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0, len=nums.length; i<len; i++){ // loop the array
            // once find the num is equal or greater than the targer, then return the index
            if(nums[i] >= target){
                return i;
            }
        }
        
        //if cannot find the targer at the end of the array, then return last index of the array
        return nums.length;
    }
}
