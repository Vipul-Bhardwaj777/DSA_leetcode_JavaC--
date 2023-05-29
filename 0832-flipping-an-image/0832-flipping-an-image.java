class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;                          // n == m as its n x n matrix
        
        for(int i = 0; i < n; i++){
           for(int j = 0; j < (n+1)/2; j++){         // traverse till half of the array
               
               if(image[i][j] == image[i][n-j-1]){     // if both first and last element are diff then reveser and ^ will bring no change 
                   
                   image[i][j] ^= 1;
                   
                   image[i][n-j-1] = image[i][j];
               }
           }
        }
        return image;
    }
}