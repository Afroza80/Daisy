
    public class Afroza5 {
        public static void main(String[] args) {
            // Step 1: Define the original matrix
            int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
            };
    
            // Step 2: Get the dimensions of the original matrix
            int rows = matrix.length;       // Number of rows
            int cols = matrix[0].length;    // Number of columns
    
            // Step 3: Create an empty matrix for the transpose
            int[][] transpose = new int[cols][rows];  // Swap rows and columns
    
            // Step 4: Compute the transpose using nested loops
            for (int i = 0; i < rows; i++) {    // Loop through rows
                for (int j = 0; j < cols; j++) { // Loop through columns
                    transpose[j][i] = matrix[i][j]; // Swap row and column
                }
            }
    
            // Step 5: Print the transposed matrix
            System.out.println("Transpose of the matrix:");
            for (int i = 0; i < cols; i++) { // Loop through new rows
                for (int j = 0; j < rows; j++) { // Loop through new columns
                    System.out.print(transpose[i][j] + " ");
                }
                System.out.println(); // Move to next line after each row
            }
        }
    }
