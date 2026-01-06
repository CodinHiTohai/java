public class searchinsorted {
    public static boolean searchinsortedmatrix(int matrix[][],int key){
        int col=0;
        int row=matrix.length-1;
        while(col<=matrix[0].length-1&&row>=0){
            if(matrix[row][col]==key){
                return true;
            }else if(matrix[row][col]>key){
                row--;

            }else{
                col++;
            }
        }
        return false;
        
    }
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key=20;
        System.out.println(searchinsortedmatrix(matrix, key));
        
    }
}
