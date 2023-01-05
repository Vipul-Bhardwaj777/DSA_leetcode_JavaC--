class Solution {
    public int reverse(int x) {
       long ans=0;
        int n=x;
        
   

    
        
        if(x>=0)
            {
        while(n>0)
            {
            
            ans=ans*10+(n%10);
       

if( ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE)

                return 0;
            
            n=n/10;

            
           
            }
            }
        
        else{
            n*=-1;
            while(n>0)

            {

            

            ans=ans*10+(n%10);
       

                
      if( ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE)
                return 0;          

            n=n/10;

            }
            ans*=-1;
            }
        
        return (int)ans;
    }
}