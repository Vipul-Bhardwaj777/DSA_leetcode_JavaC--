class Solution {
    public int search(int[] nums, int target) {
        
        int p=pivot(nums);
      
        if(p==-1){ 
            return bis(nums,target,0,nums.length-1);
            }
        
        
        
        if(nums[p]==target)return p;
        
        else if(nums[0]<=target)return bis(nums,target,0,p-1);
        
        else{ return bis(nums,target,p+1,nums.length-1);}
       
 
        
    }
    
    int bis(int[] arr,int target,int s,int e)

        {

         while(s<=e)

        {

            int mid=s+(e-s)/2;

        if(arr[mid]==target) return mid;

        

         

        

        if(arr[mid]<target) s=mid+1;

        

        else{ e=mid-1;}

            }
        return -1;
        }
    
 
int pivot(int[] nums)
    {
    
    int s=0,e=nums.length-1;
    
    while(s<=e)
        {
        int mid=s+(e-s)/2;
        if(mid<e && nums[mid]>nums[mid+1])return mid;
   
         if(mid>s && nums[mid]<nums[mid-1])return mid-1;
        
        else if(nums[mid]<nums[s]) e=mid-1;
        
        else{
            s=mid+1;
            }
        }
    return -1;
          
        
        
        
        
        }
    

        

        

       

       

        

      

           

        

       

         

      

        

        

        

    

    

    
}