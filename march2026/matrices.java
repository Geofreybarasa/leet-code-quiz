// in java matrix is a simple 2d array ; think it as a table with rows and col
// key terminologies
// rows-> first dimensions (matrix.length)
//cols-> second dimensions (matrix[0].length)
// cell/element individual value at an index matrix[row][col]
//square matrix has same no. of rows and cols
//identity matrix 1's on the diagonols
  
//core operations ---> traversal(walkthrough)
public class matrices{
       public static void main(String[] args){    
    }
}

     //Row-major order
  class rowMajor{
        public  void traversal(){
            System.out.println("left to right : top to bottom");
         int[][] matrix = new int[3][3];
         int val = 1;

            for(int i=0; i<=matrix.length-1;i++){
                for(int j=0; j<=matrix[0].length-1;j++){
                 matrix[i][j] = val;
                 System.out.print(matrix[i][j] + " ");
                    val++;
             }
            System.out.println();
        }
    }

 }

 class colMajor{
    public void traversal(){
        System.out.println("top to bottom : left to right");
        int[][] matrix = new int[3][3];
        int val = 1;
        for(int i= 0; i<matrix.length;i++){
            for(int j = 0 ; j<matrix[0].length;j++){
                matrix[i][j] = val;
                val++;
            }
        }

        for(int j = 0; j<matrix[0].length;j++){
            for(int i = 0; i<matrix.length;i++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class addition{
    public  int[][] addMatrices(int[][] a, int[][] b ){
        //validate dimension
        if(a.length != b.length || a[0].length != b[0].length){
            throw new IllegalArgumentException("Matrices must have same dimensions");
        }
        int row = a.length;
        int col = b[0].length;
        int[][] result = new int[row][col];

        for(int i = 0; i < row ; i++){
            for(int j = 0 ;j < col ; j++){
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }
    public  void printMatrix(int[][] matrix){
        for(int[] row : matrix){
            for(int val : row){
                System.out.print(val + " ");
            }
            System.out.println();
        }
        

    }
}

class multiply{
    //Rule : A column must equal B rows

    public int[][] multiplying(int[][] a, int[][] b){
        int aRows = a.length;
        int aCols = a[0].length;
        int bRows = b.length;
        int bCols = b[0].length;

        //validation
        if(aCols != bRows){
            throw new IllegalArgumentException(
                "cannot multiply: A columns(" + aCols + 
                ")must equal B rows("+ bRows +")"
            );
        }

        int[][] result = new int[aRows][bCols];

        //triple nested loops
        for(int i=0; i<aRows;i++){
            for(int j=0; j<bCols;j++){
                for(int k = 0; k<aCols; k++){
                    result[i][j] += a[i][k] *b[k][j];
                }
            }
        }
        return result;
    }
}


 

