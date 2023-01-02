class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        if(nums.size()==1)return nums[0];
       int  maxsum=INT_MIN;

      int  currsum=0;
        for(int i=0;i<nums.size();i++)
            {
            currsum+=nums[i];
            
            
            if(maxsum<currsum)
            
                {maxsum=currsum;}
            
            if(currsum<0)

                {currsum=0;}
            }
        return maxsum;
            
        
    }
};