class Solution {
public:
    vector<string> generateParenthesis(int n) {
        vector<string> v;
        int o=n;
        int c=n;
        solve(o,c,"",v);
        return v;
        }
    
    void solve(int o,int c,string ans,vector<string>& v)
        {
        if(o==0 && c==0)
            { v.push_back(ans);
             return;
             }
        
        if(o>0)
            { solve(o-1,c,ans+'(',v);
             }
        if(c>o)
            { solve(o,c-1,ans+')',v);
             }
             
             
        
        
    
 
    }
};