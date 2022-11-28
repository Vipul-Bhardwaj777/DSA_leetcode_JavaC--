class Solution {
public:
    string longestPalindrome(string s) {
        
        if(s.size()==1)
            {return s;}
        
        
       int maxl=1,start=0;
      for(int i=0;i<s.size();i++)
          {
          
          
          int l=i,r=i;
        while(l>=0 && r<s.size())
            {
          if(s[l]==s[r])
              { l--;
               r++;}
          else { break;}
          
          
          int len=r-l-1;
          if(len>maxl)
              {
              

          start=l+1;
              maxl=len;
              }
          
          }
          }
         
          
      for(int i=0;i<s.size();i++)
          {
           int   l=i,r=i+1;
        while(l>=0 && r<s.size())
            {
          
       

          

          if(s[l]==s[r])

              { l--;

               r++;}

          else { break;}
          

          

        int  len=r-l-1;

          if(len>maxl)

              {
              
          start=l+1;

              maxl=len;

              }
            }

          
          
          
          
          }
        
        
        return s.substr(start,maxl);
        
        
    }
};