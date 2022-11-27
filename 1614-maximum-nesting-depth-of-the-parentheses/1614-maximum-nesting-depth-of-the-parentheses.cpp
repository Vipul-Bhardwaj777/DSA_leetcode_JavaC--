class Solution {
public:
    int maxDepth(string s) {
        
     //   if(s.empty())
      //      return 0;
        
        int count=0;
        int mxc=INT_MIN;
        
        for(int i=0;i<s.size();i++)
            {
            
            if(s[i]=='(')
                count++;
            
            if(s[i]==')')
                count--;
            
            
            
        
        mxc=max(mxc,count);
            }
        
        
   return mxc; }
};