class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int minsf=prices[0];
        int mxp=0;
        
        for(int i=0;i<prices.size();i++)
            {
            minsf=min(minsf,prices[i]);
            int profit=prices[i]-minsf;
            mxp=max(mxp,profit);
            }
        return mxp;
    }
};