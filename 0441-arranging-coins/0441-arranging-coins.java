class Solution {
    public int arrangeCoins(int n) {
        
        long s=1,e=n;  // int will overflow so long is used
        
        while(s<=e)
            {
            long m=s+(e-s)/2;   
            
            if((m*(m+1))/2 == n) return (int) m;   // m*(m+1)/2 gives the sum of all nos upto m and if sum of all nos upto midpoint = n this means n coins will perfectly complete the m no of stairs   
                
             if((m*(m+1))/2 < n)
                 {
                
                 s=m+1;
                 }
            
            else{ e=m-1;}
            }
        return (int) e; // loop will break if perfect ans is not found so ans will be at end  
    }
}