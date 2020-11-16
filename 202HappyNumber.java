class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        //add the original n value to set
        set.add(n);
        
        while(true){
            //get next value
            int next = getNext(n);
            
            if(next == 1) return true; //happy number
            if(!set.add(next)) return false; //duplicate number find, not happy number;
            
            set.add(next);
            n = next;
            
        }
    }
    

    public int getNext(int n){
        int sum = 0;
        while(n > 0){
            //calculate the reminder
            int r = n % 10;
            //sum the value
            sum += r * r;
            //update n value
            n /= 10;
        }
        
        return sum;
    }
    
}
    

