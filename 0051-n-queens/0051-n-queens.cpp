class Solution {
public:
    vector<vector<string>> solveNQueens(int n) {
        
        vector<vector<string>> v;
       
        vector<string> board(n,string(n,'.'));
        
        nqueen(board,0,n,v );
        return v;
        }
    
   
    bool issafe(vector<string> board,int row,int col,int n)

        {

             for(int i=row;i>=0;i--)

              { if(board[i][col]=='Q') return false;}

        

                int x=row;

                int y=col;

             while(x>=0 && y>=0)

             { if(board[x][y]=='Q')return false;

               x--;

               y--;}

        

             x=row;

             y=col;

            while(x>=0 && y<n)

             { if(board[x][y]=='Q')return false;

              x--;

              y++;}

        

           return true;}

          
        
        
        
        
        
       
    void nqueen(vector<string>  board,int row,int n,vector<vector<string>>& v) 
    {
        if(row==n)
            {
            v.push_back(board);
            return;
            }
        
        for(int col=0;col<n;col++)
           {
            if(issafe(board,row,col,n))
   {   board[row][col]='Q';
              
     nqueen(board,row+1,n,v);
       
               
     board[row][col]='.';
               
              
          } 
            }
            
      
        
        
        
    }
};