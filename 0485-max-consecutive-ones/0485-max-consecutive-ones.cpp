class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int mx=INT_MIN,curr=0;
        for(int i=0;i<nums.size();i++)
            {
            if(nums[i]==1)
               { 
                curr++;}
            
            else{curr=0;}
           mx=max(mx,curr);
            }
        
  return mx ; }
};