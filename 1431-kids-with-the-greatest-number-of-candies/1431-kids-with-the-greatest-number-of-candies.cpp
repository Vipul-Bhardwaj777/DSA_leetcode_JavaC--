class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
        
        
      vector<bool>v;
        
     int  mx=*max_element(candies.begin(),candies.end());
     // int mx=INT_MIN;
        
        for(int i=0;i<candies.size();i++)
            {
            //mx=max(mx,candies[i]);
                   if(candies[i]+extraCandies>=mx)
           v.push_back(true);
            
            else{ v.push_back(false);
                   
                   }
            }
                   
           
      return v;             
    }
};