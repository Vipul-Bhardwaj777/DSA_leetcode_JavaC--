class Solution {
    public int mySqrt(int x) {
        
        if(x==0 || x==1)return x;

        int s=0,e=x;

        while(s<e)

            {

            int mid=s+(e-s)/2;

            int temp=x/mid;

            
if(temp==mid)return mid;
            if(temp<mid)
                {
                
                e=mid;

            }

            else{ s=mid+1;}

            }

        return s-1;
    }
}