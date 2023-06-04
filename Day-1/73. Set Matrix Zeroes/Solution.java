class Solution {
    public void setZeroes(int[][] matrix) {
        
        // Matrix row and length
        int m = matrix.length;
        int n = matrix[0].length;
        
        // Taking these two fields whether first row and colums contains any zeros 
        int x = 1;
        int y = 1;
        
        // if first colums contains zeros initialize X field to zero
        for(int j = 0; j < n ; j++ ){
            if(matrix[0][j] == 0) x = 0;
        }
        
        // if first row contains zeros initialize Y field to zero
        for(int i= 0; i<m ; i++){
            if(matrix[i][0] == 0) y = 0;
        }
        
        
        // check the rows from 1 to last and update the position in first row and columns if it contains zeros 
        for(int i = 1; i< m ; i++){
            
            for(int j = 1 ; j < n ; j++){
                
                if(matrix[i][j] == 0){
                    
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }    
            }
            
        }
        
        
        
        // if it contains zero then make change in its particular row and colums
        for( int j = 1 ; j < n ; j++){
            if(matrix[0][j]==0){
                for(int i = 0; i < m ; i++){
                    matrix[i][j] = 0;
                }
            }
        }
        
        
        for(int i = 1; i < m ; i++){
            if(matrix[i][0] == 0){
                for(int j = 0; j  < n ; j++){
                    matrix[i][j] = 0;
                }
            }
            
        }
        
        // finally if x and y contains zeros and make these position also zeros
        if(x == 0 ){
            for(int j = 0; j < n ; j++)
                matrix[0][j] = 0;
        }
        
        if( y == 0 ){
            for(int i = 0; i < m ; i++)
                matrix[i][0] = 0;
        }
        
        
        
        
    }
}
