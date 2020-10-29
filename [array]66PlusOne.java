class Solution {
    public int[] plusOne(int[] digits) {
        //loop the array from back
        for(int i=digits.length-1; i>=0; i--){
            if(digits[i] == 9){
                digits[i] = 0; // if is 9, then change the 9 to 0
            }else{
                digits[i]++; //index plus one
                break;
            }
        }
        
        if(digits[0] == 0){
            int[] new_digits = new int[digits.length + 1];
            new_digits[0] = 1;
            return new_digits;
        }
        
        return digits;
    }
}
