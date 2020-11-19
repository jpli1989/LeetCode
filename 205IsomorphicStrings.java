class Solution {
public boolean isIsomorphic(String s, String t) {
    int len = s.length();
    //use the ASCII 
    int[] mapS = new int[128];
    int[] mapT = new int[128];
    
    for(int i=0; i<len; i++){
        char charS = s.charAt(i);
        char charT = t.charAt(i);
        
        //check the value if the same
        if(mapS[charS] != mapT[charT]) return false;
        else{
            if(mapS[charS] == 0){
                mapS[charS] = i + 1;
                mapT[charT] = i + 1;
            }
        }
    }
    
    return true;
}
}
