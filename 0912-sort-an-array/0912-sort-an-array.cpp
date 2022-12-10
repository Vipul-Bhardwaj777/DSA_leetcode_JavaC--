class Solution {
public:
    vector<int> sortArray(vector<int>& nums) {
        
       
        
        mergesort(nums,0,nums.size()-1);
        return nums;
        }
    
    
    
  void  mergesort(vector<int>& nums,int l,int h)
      
        { int mid=(l+h)/2;
            
            if(l<h)
            { mergesort(nums,l,mid);
             mergesort(nums,mid+1,h);
             merge(nums,l,h,mid);
             }
         }
    
    
    
    void merge(vector<int> &nums,int l,int h,int mid){
       
        int ans[h+1];
        
        int i=l;

 int j=mid+1;
            int k=l;
        
        while(i<=mid && j<=h  )
            { 
              if(nums[i]<nums[j])
                { 
                 ans[k]=nums[i];
                 i++;
                 k++;
                 } 
             

               else { 
                   ans[k]=nums[j];

                   j++;
                   k++;
                 } 
             
             }
        
  if(i>mid)
  { 
             while(j<=h)
               {
      ans[k]=nums[j];
   j++;
               k++;
         }
}
       
  else{ 
            
            while(i<=mid)
  {
              ans[k]=nums[i];
              i++;
              k++;
          }
          }
   
       for(int i=l;i<=h;i++)
            { nums[i]=ans[i]; }
     }
   

    
};