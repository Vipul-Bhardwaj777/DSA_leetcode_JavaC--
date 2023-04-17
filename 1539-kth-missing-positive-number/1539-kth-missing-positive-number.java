class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        // See notes for O(n) approach
        
        // O(log n) binary search approach below
        
        if( arr[0] > k) return k;
        
        int s=0, e=arr.length-1;
        
        while(s<=e){
            
            int mid = s+(e-s)/2;
            
            if( arr[mid] - (mid+1) < k ){
                s = mid+1;
            }
            
            else{
                e = mid-1;
            }
        }
        
         // return arr[e] + ( k-(arr[e] - (e+1)));
        
            return s + k;
        
    }
}