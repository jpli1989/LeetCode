class Solution {
    public int[] twoSum(int[] nums, int target) {
        //use hashmap to store the value and index
        Map<Integer, Integer> temp = new HashMap<>();
        int sub;
        //loop the int array
        for(int i=0, len=nums.length; i<len; i++){
            //calculate the sub value
            sub = target - nums[i];
            if(temp.containsKey(sub)){ // if the map contains the sub value, then return the index value into new int array
                return new int[]{temp.get(sub), i};
            }
            //if the map not contains the sub values, then store data into map
            temp.put(nums[i], i);
        }
        return new int[]{};
    }
}
