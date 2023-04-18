class Solution {
    
      public int Bis( int[] arr, int target  ){
          
          int s = 0, e = arr.length - 1;
          
       while(s<=e){   int mid = s + (e - s)/2;
          
          if( arr[mid] == target) return mid;
          
          else if( arr[mid] > target) e = mid - 1;
          
          else{ 
              
              s = mid + 1; }
                   }
          
          return -1;
          
      }
    
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        
        // Binary Search O(nlogn)
        
        int sa=0, sb=0;
             
        // Find sum of both the arrays
        for(int i: aliceSizes){
            sa+=i;
        }
       
         for(int i: bobSizes){
            sb+=i;
        }
        
        int diff = (sa - sb)/2;
        
        Arrays.sort(aliceSizes);
        
        for( int x : bobSizes){
            
            if(Bis(aliceSizes, x + diff) != -1) return new int[] {x+ diff, x};
        }
        
        return new int[] {};
        
        
    }
}