class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        
        //check the numRows
        if(numRows == 0) return res;
        
        //the first row forever is {1}
        res.add(new ArrayList<>());
        res.get(0).add(1);
        
        for(int i=1; i<numRows; i++){ // start from second row
            List<Integer> cur_row = new ArrayList<>();
            List<Integer> pre_row = res.get(i-1); // get last row
            
            //row first element forever is 1
            cur_row.add(1);
            
            for(int j=1; j<i; j++){
                cur_row.add(pre_row.get(j-1) + pre_row.get(j));
            }
            
            cur_row.add(1);
            
            res.add(cur_row);
        }
        
        return res;
    }
}
