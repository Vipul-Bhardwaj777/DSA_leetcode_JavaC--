class Solution {
public:
    vector<vector<int>> flipAndInvertImage(vector<vector<int>>& image) {
        
      for(auto& row:image)
          {
          reverse(row.begin(),row.end());
          for(auto& j:row)
                  {
                     j^=1; }
          }
        
        return image;
    }
};