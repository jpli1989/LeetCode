class Solution {
 public boolean wordPattern(String pattern, String str) {
        //store words into array after split by space
        String[] words = str.split(" ");
        //if length different then return false
        if(pattern.length() != words.length) return false;
        //use Map put return value
        //if value not exists, then return null
        //if value already exist, then return the previous value
        //here use Integer, because map value only accept Integer
        Map res = new HashMap();
        for(Integer i=0; i<words.length; i++){
            if(res.put(pattern.charAt(i),i) != res.put(words[i], i)) return false;
        }
     
        return true;
    }
}
