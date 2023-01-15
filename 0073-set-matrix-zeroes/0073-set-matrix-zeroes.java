class Solution {
    public void setZeroes(int[][] matrix) {
        
        int n=matrix.length,m=matrix[0].length;
        
    int[] rm=new int[n];
        
    int[] cm= new int[m];
        
     for(int i=0;i<n;i++)
         {
         for(int j=0;j<m;j++)
             {
             if(matrix[i][j]==0)
               {  
            rm[i]=-1;
            cm[j]=-1; }
          
             }
         }
        
        
    for(int i=0;i<n;i++)

         {

         for(int j=0;j<m;j++)

             {

             if(rm[i]==-1 || cm[j]==-1)
                 {

                 matrix [i][j]=0;
                 }

             }

        }

        

        

        

        

        

        

        
        
        
    }
}