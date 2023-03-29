class Solution {
    public int minInsertions(String s) {
        
        char[] ch = s.toCharArray();
        int count = 0;
        int ans = 0;
        
        for(int i = 0; i < ch.length; i++){
            
            if(ch[i] == '('){
                count++;       // if opening found
            }
            
            
            else{                           // if closing found
                
                
                
                if(i+1 < ch.length && ch[i+1] == ')' ){  // if next is also closing i.e )), check for count i.e prev '('
                    i++;
                    if(count > 0) count--;     //prv of )) is ( so only cancel balanced no addition count-- as ( is gone
                    
                    else{ ans++; }             // prev of )) is empty no ( , so add 1 ans++ as we added to balance
                }
                
                
                
                else{                                   // if next is not closing i,e )( 
                    
                    
                    if(count > 0){
                        
                     ans++; 
                     count--;                  // prev of )( is ( so we need 1 to balance ()..( ans++ count-- as                                                          removed
                    }
                    else{ ans+=2; }               //  prev of )( is empty so we need 2 to balance  ..)..(
                }
               
                
                
                
            }
            
            
            
        }
        
        ans = ans + (count * 2);           // ans contains the no of brackets we added and if after that still cont != 0                                               this means we have open brackets left so we need count * 2 to balance them 
        
        return ans;
        
        
    }
}