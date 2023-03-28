class Solution {
    public int minAddToMakeValid(String s) {
        
        Stack<Character> st = new Stack<>();
        
        for(char ch : s.toCharArray()){
            
            if(ch == '(') st.push(ch);           // Push if it's opening bracket
            
            else{
                
                if(!st.isEmpty() && st.peek() == '(') st.pop(); // pop if its closing bracket, but if theres nothing to pop this means an unbalenced closed bracket found, so push it in stack to get the count of size
                
                else{ st.push(ch); }            // stack is empty and unbalanced closed bracket found
            }
        }
        
        
        
        return st.size();                   // size of stack is the no of unbalanced brackets so to balance them we need                                                   equal amount of brackets so ans is size of stack
        
    }
}