class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //use a map to store the current value as key, and index as the value
       Map<Integer, Integer> res = new HashMap<>();
        
       for(int i=0; i<nums.length; i++){
           //if map contains the key which is the value
           if(res.containsKey(nums[i])){
               //get the index
               int index = res.get(nums[i]);
               //calculate the difference of the index, if <= k, then return
               if(i-index <= k) return true;
           }
           
           res.put(nums[i],i);
       } 
        
        return false;
    }
}
