class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> pre_row = new ArrayList<>();
        List<Integer> cur_row = new ArrayList<>();
        
        for(int i=0; i<=rowIndex; i++){
            cur_row = new ArrayList<>(); //refresh the list for each row
            
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){ //the first element and last element
                    cur_row.add(1);
                }else{
                    cur_row.add(pre_row.get(j-1) + pre_row.get(j));
                }
            }
            
            pre_row = cur_row; //update pre_row with cur_row value
        }
        
        return cur_row;
    }
}
