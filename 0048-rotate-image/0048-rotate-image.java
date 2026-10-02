class Solution {
    public static int[][] swap_matrix(int matrix[][],int i,int j){
        int temp=matrix[i][j];
        matrix[i][j]=matrix[j][i];
        matrix[j][i]=temp;

        return matrix;
    }
    public static int[][] transpose(int matrix[][],int n,int m){
        for (int i=0;i<n;i++){
            for (int j=i+1;j<m;j++){
                swap_matrix(matrix,i,j);
            }
        }
        return matrix;
    }
    public static int[][] reverse_array2(int matrix[][],int n,int m){
        for (int i=0;i<n;i++){
            int start=0;
            int end=m-1;
            while(start<=end){
                int temp=matrix[i][start];
                matrix[i][start]=matrix[i][end];
                matrix[i][end]=temp;
                start++;
                end--;
            }
        }
        return matrix;  
    }
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        transpose(matrix,n,m);
        reverse_array2(matrix,n,m);
        
    }   
}