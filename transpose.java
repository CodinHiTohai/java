public class transpose {
    public static int[][] transposematrix(int matrix[][],int row,int col){
        int transpose[][]=new int[col][row];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                transpose[j][i]=matrix[i][j];

            }
        }
        return transpose;
    }
    public static void print(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6}};
        int transpose[][]=  transposematrix(matrix, 2, 03);
        print(transpose);

    }
}
