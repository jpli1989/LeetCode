class Solution {
    public int countPrimes(int n) {
       //use a boolean array and default value false
        boolean[] res = new boolean[n];
        
        int count=0;
        for(int i=2; i<n; i++){
            if(res[i] == false){// is prime number
                count++;
                //find all the multiple numbers based on current number
                for(int j=2; i*j < n; j++){
                    //update all the multiple numbers to true
                    res[i*j] = true;
                }
            }
        }
        
        return count;
    }
}
