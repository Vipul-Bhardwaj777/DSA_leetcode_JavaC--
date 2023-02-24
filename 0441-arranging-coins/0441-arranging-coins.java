class Solution {
    public int arrangeCoins(int n) {
        long s=1,e=n;
        long ans=-1;
        while(s<=e)
            {
            long m=s+(e-s)/2;
            
           
             if((m*(m+1))/2<=
                n)
                 {
                ans= m;
                 s=m+1;
                 }
            
            else{ e=m-1;}
            }
        return (int)ans;
    }
}