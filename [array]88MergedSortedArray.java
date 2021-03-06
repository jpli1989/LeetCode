class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {      
        int tail1 = m -1, tail2 = n-1;
        int cur_index = m + n -1;
        
        while(tail1 >=0 && tail2 >=0){
            nums1[cur_index--] = nums1[tail1] > nums2[tail2] ?
                                nums1[tail1--] : nums2[tail2--];
        }
        
        while(tail2 >=0){ // while all nums2 values are smaller than nums1
            nums1[cur_index--] = nums2[tail2--];
        }
        
    }
}
