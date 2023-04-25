class Solution {
    public int countNegatives(int[][] grid) {
        
        int n=grid.length,m=grid[0].length,c=0;
        int i=0,j=m-1;
        while(i<n && j>=0)
            {
            if(grid[i][j]<0)
                {
                c+=n-i;
                j--;
                }
            else{ i++;}
            }
        return c;
        
    }
}