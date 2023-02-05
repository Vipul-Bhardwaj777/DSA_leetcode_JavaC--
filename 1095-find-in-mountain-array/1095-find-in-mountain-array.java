/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        
      int P=Peak(mountainArr);
       
  int left=bis(mountainArr,target,0,P);
        if(left!=-1)return left;
            
        
        return bis(mountainArr,target,P+1,mountainArr.length()-1);
   
    }
    
    int bis(MountainArray arr,int target,int s,int e)
        {
        
        
        
        boolean asc= arr.get(s)<arr.get(e);

        while(s<=e)
        {
            int mid=s+(e-s)/2;
        if(arr.get(mid)==target) return mid;
        
         if(asc){
        
        if(arr.get(mid)<target) s=mid+1;
        
        else{ e=mid-1;}
            }
        
        else{
            if(arr.get(mid)<target) e=mid-1;

        

        else{ s=mid+1;}
            }
        }
        return -1;
        
        }
    
    
    
    int Peak(MountainArray nums) {
        
       int s=0,e=nums.length()-1;
     
        while(s<e)
            {
               int mid=s+(e-s)/2;
            if(nums.get(mid)<nums.get(mid+1))s=mid+1;
            
            else{ e=mid;}
            }
        
        return s;}
}