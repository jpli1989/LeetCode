class Solution {
    public boolean isAnagram(String s, String t) {
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        
        //sort the arrays
        Arrays.sort(cs);
        Arrays.sort(ct);
        
        //convert the charArray to string
        s = String.valueOf(cs);
        t = String.valueOf(ct);
        
        return s.equals(t);
    }
}
