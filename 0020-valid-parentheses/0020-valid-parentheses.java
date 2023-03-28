class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st = new Stack<>();
        
        for(char ch : s.toCharArray()){                                // traverse as chararray and push opening                                                                                   brackets 
            
            if(ch == '(' || ch == '[' || ch == '{') st.push(ch);
            
            else{                                                     // else closing bracket is found and which                                                                                  specific one is found below
                
                if(ch == ')'){
                    
                    if(st.isEmpty() || st.pop() != '(') return false; // when first closing is found check if its                                                                                opening is present at peek but check isempty                                                                             first due to exception risk, and if not found                                                                           return false 
                } 
                
                if(ch == ']'){
                    
                    if(st.isEmpty() || st.pop() != '[') return false;
                } 
                
                if(ch == '}'){
                    
                    if(st.isEmpty() || st.pop() != '{') return false;
                } 
            }
            
            
        }
        
        
        
        
        
        return st.isEmpty();              //  If stack is empty at the end return true
    }
}