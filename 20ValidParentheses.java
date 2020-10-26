class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()){
            if(c == '(') stack.push(')'); // e.g. if '(' -> stack is ')'
            else if( c== '[') stack.push(']'); // e.g. if '[' -> stack is ']' 
            else if(c== '{') stack.push('}'); // e.g. if '{' -> stack is '}'
            else{
                if(stack.isEmpty() || c != stack.pop()){ //e.g. if ')' -> stack pop is ')'
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
}
