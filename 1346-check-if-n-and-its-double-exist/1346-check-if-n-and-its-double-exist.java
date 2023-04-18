class Solution {
     
    // Binary Search 
    
    public int Bis(int[] arr, int target){
        
        int s = 0, e = arr.length - 1;
        
        while(s<=e){
            
            int mid = s + (e-s)/2;
            
            if(target == arr[mid]) return mid;
            
            else if(target < arr[mid]) e = mid-1;
            
            else{
                s = mid+1; 
            }
            
            
        }
        
        return -1;
    }
    public boolean checkIfExist(int[] arr) {
        
        Arrays.sort(arr);
        
       for(int i = 0; i<arr.length; i++){
           
           // Now traverse over the sorted arr and check if double of the element is equal to any other element, and if its double is equal to any element return true. And the double is always valid for a diff index
           
           if(Bis(arr, arr[i]*2) != -1 && Bis(arr, arr[i]*2) != i) return true;
           
       }
        
        return false;
        
        
        
    }
}