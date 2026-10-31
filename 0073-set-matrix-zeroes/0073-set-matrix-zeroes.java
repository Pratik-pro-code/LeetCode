// class Solution {
//     public void setZeroes(int[][] matrix) {
        
//         int rolength = matrix.length;
//         int collength = matrix[0].length;
//         int [][] mat= new int[rolength][collength];
    
//         for(int i=0;i< rolength;i++){
//             for(int j=0; j< collength; j++) {
//                 if(matrix[i][j] == 0){
//                     for(int row=0; row < rolength;row++){
//                         if(mat[row][j] != 0) {
//                             mat[row][j] = 0;
//                         }
//                     }
                
//                  for(int col=0; col < collength;col++){
//                         if(mat[i][col] != 0) {
//                             mat[i][col] = 0;
//                         }
//                     }
//                 }
//             }
//         }
//         System.out.print("mat");
//     }
// }
class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        for(int i=0;i< m; i++){
            for(int j = 0; j< n; j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for(int i=0;i< m; i++){
            for(int j = 0; j< n; j++){
                if(row[i] || col[j]){
                    matrix[i][j] = 0;
                }
            }
        }
      
    }
}
