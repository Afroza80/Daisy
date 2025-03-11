
    public class Afroza7 {
        public static void main(String[] args) {
            // Step 1: Define two matrices
            int[][] A = {
                {1, 2},
                {3, 4}
            };
    
            int[][] B = {
                {5, 6},
                {7, 8}
            };
    
            // Step 2: Get the sizes of matrices
            int rowsA = A.length;        // Rows of A
            int colsA = A[0].length;     // Columns of A
            int rowsB = B.length;        // Rows of B
            int colsB = B[0].length;     // Columns of B
    
            // Step 3: Check if multiplication is possible
            if (colsA != rowsB) {
                System.out.println("Matrix multiplication not possible!");
                return;
            }
    
            // Step 4: Create result matrix
            int[][] C = new int[rowsA][colsB];
    
            // Step 5: Perform matrix multiplication
            for (int i = 0; i < rowsA; i++) { // Loop through rows of A
                for (int j = 0; j < colsB; j++) { // Loop through columns of B
                    for (int k = 0; k < colsA; k++) { // Loop through elements of A & B
                        C[i][j] += A[i][k] * B[k][j]; // Multiply & add to result
                    }
                }
            }
    
            // Step 6: Print the result matrix
            System.out.println("Resultant Matrix (Multiplication):");
            for (int i = 0; i < rowsA; i++) {  
                for (int j = 0; j < colsB; j++) {  
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            }
        }
    }



