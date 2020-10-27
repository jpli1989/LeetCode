class Solution {
    public int removeDuplicates(int[] nums) {
         //use 2 pointers: slow pointer and fast pointer
        int i = 0, j = 1;
        for(; j< nums.length; j++){
            //do value compare here
            if(nums[j] > nums[i]){ // fast pointer value is biggere than slower pointer value
                i++; //move i
                nums[i] = nums[j]; // assign the bigger value to the new index
                
            }
        }
        
        return i + 1;
    }
}
