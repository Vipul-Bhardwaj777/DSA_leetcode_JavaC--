class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        
        int n=matrix.length,m=matrix[0].length;
     int[] arrmi=new int[n];
       int[] arrmx=new int[m]; 
        int k=0;
        for(int i=0;i<n;i++)
            { int min= Integer.MAX_VALUE;
            
            for(int j=0;j<m;j++)
                {
                
                min=Math.min(min,matrix[i][j]);
                
             }   
             arrmi[k++]=min;
             }
        
        
        
        int l=0;

        for(int j=0;j<m;j++)

            { int max= Integer.MIN_VALUE;

            

            for(int i=0;i<n;i++)

                {

                

                max=Math.max(max,matrix[i][j]);

                

                
}
             arrmx[l++]=max;

             }
        
   
      
        List<Integer> ans=new ArrayList<>();
     
        for(int i=0;i<n;i++)
            { 
            
            for(int j=0;j<m;j++)
                {
                
                if(arrmi[i]==arrmx[j]) ans.add(arrmi[i]);
                    
               
                
                }
             
             }  
        
        
        return ans;
        
        
        
   
        
        
     
        
        
        
        
        
       
        
        
        
    }
}