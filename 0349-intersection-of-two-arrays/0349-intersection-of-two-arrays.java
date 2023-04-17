class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
          // Two pointer method
        
        int n = nums1.length, m = nums2.length;
        
        // Create a list
        List<Integer> list = new ArrayList<>();
        
        // Then sort both the arrays
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int i=0, j=0;
        
        // Traverse the arrays  and compare the elements
        while(i<n && j<m){
            
            // If the elements are same we get one intersection and add to list (But only add if its not alrady present)
            if(nums1[i] == nums2[j]){
                if(list.contains(nums1[i])){
                     i++;
                j++;
                }
            
            // Element not found in the list so add
                else {
                    list.add(nums1[i]);
                i++;
                j++;
                }
            }
            
            // If nums1[i] < nums2[j] this means that there can't be an intersection if we move j as array is sorted
            else if(nums1[i] < nums2[j]) i++;
            
            // If  nums1[i] > nums2[j] this means that there can't be an intersection if we move i as array is sorted
            else{ j++; }
            
        }
        
        
        // Return the list after converting it into an array
        int[] ans = new int[list.size()];
        
        for(int k = 0; k < list.size(); k++){
            ans[k] = list.get(k);
        }
        
        return ans;
        
        
        
    }
}