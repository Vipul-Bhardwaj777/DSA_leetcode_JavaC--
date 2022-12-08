class Solution {
public:
    vector<string> letterCasePermutation(string s) {
      
        vector<string> v;
       
        letter(s,"",v);
       return v;
        }
    
    void letter(string s,string ans,vector<string> & v)
        {
        if(s.size()==0)
            {
            v.push_back(ans);
            return;
            }
        char ch=s[0];
        
        if(isalpha(ch))
        {
            
    

char ch2=toupper(ch);
            
             char    ch1=tolower(ch);
            letter(s.substr(1),ans+ch1,v);
                letter(s.substr(1),ans+ch2,v);
                       
        }
        else{ 
            letter(s.substr(1),ans+ch,v);
            }
        
        
        
    }
};