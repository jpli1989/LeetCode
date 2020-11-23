class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //here use 2 sets 
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        //add all nums1 array into 
        for(int num1 : nums1){
            set1.add(num1);
        }
        
        //loop nums2 array, check if any duplicate with set1
        //if there is duplicate numbers, then added into the new set2
        for(int num2 : nums2){
            if(set1.contains(num2)) set2.add(num2);
        }
        
        //create a new array with the set2 size
        int[] arr = new int[set2.size()];
        int count = 0;
        for(int num : set2){
            arr[count++] = num;
        }
        
        return arr;
    }
}
