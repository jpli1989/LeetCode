class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0; //a pointer start from 0
        for(int num : nums){ //loop the array
            if(num != val){ // if the num is not equal to the val
                nums[i] = num; // then assign the val to current pointer
                i++; // move back pointer
            }
        }
        return i;
    }
}
