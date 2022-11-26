class Solution {
public:
    int countMatches(vector<vector<string>>& items, string ruleKey, string ruleValue) {
        
        int i;
        
        if(ruleKey=="type")
            i=0;
      else if(ruleKey=="color")
            i=1;
        
        else{ i=2; }
        
        int count=0;
        for(int j=0;j<items.size();j++)
            
            {
            if(items[j][i]==ruleValue)
                count++;
            }
        
        return count;
    }
};