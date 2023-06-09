 public void rotate(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        // First Transpose the Matrix values rows to columns and columns to rows
        for(int i =0; i<n;i++){
            for(int j = 0 ; j<=i ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

   
   // Then rotate the column values in the matrix from first to last upto middle
        for(int i =0 ;i < n ; i++){
            for(int j =0 ; j < m/2 ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][m-j-1];
                matrix[i][m-j-1] = temp;
            }
        }

    }
