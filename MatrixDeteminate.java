
public class MatrixDeteminate {
    public static void main(String[] args) {
        int[][] matrix = {{ 1, 2, 3, 4},
                          { 5, 6, 7, 8},  
                          { 9,10,11,12},
                          {13,14,15,16}};
        System.out.println(determinant(matrix)); 

       
        
    }

    public static int determinant(int[][] matrix) {

        if(matrix.length == 1){
            return matrix[0][0];    
        }

        if(matrix.length == 2){
            return matrix[0][0] * matrix[1][1] - matrix[1][0] * matrix[0][1];
        }

        int determinant = 0;
        for(int i = 0; i < matrix[0].length; i++){
            determinant += i % 2 == 0 ? + matrix[0][i] * minor(matrix, 0, i) :  - matrix[0][i] * minor(matrix, 0, i);
        
        }

        return determinant;
    }


    private static int minor(int[][] matrix, int subMatrix, int numberOfSubmatrix){

        int[][] minorMatrix = new int[matrix.length-1][matrix[0].length-1];

        for(int i = 0, i1 = 0 ; i < minorMatrix.length && i1 < matrix.length ; i++ , i1++){ 
            if(i1 == subMatrix) i1++;
            for(int j = 0, j1 = 0 ; j < minorMatrix[i].length && j1 < matrix[i1].length; j++, j1++){
                if(j1 == numberOfSubmatrix) j1++;
                minorMatrix[i][j] = matrix[i1][j1];
            }
        }

        if(minorMatrix.length != 2){
            int determinant = 0;
            for(int i = 0; i < minorMatrix[0].length; i++){
                determinant += i % 2 == 0 
                ? + minorMatrix[0][i] * minor(minorMatrix, 0, i)
                :  - minorMatrix[0][i] * minor(minorMatrix, 0, i);
            }
            return determinant;
        }

        int resultOfMinor = minorMatrix[0][0] * minorMatrix[1][1] - minorMatrix[1][0] * minorMatrix[0][1];

        return resultOfMinor;
    }

}
