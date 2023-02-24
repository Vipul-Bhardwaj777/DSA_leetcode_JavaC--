class Solution {
    public boolean isPerfectSquare(int num) {
        
        int s=1,e=num;
        
        while(s<=e)
            {
            int mid=s+(e-s)/2;
            int temp=num/mid;
            
            if(temp==mid && num%mid==0) return true;
            else if(temp<mid)e=mid-1;
            
            else{s=mid+1;}
            }
        return false;
    }
}