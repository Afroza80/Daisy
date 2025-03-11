public class Afroza6 {
    public static void main(String[] args) {
        // Step 1: Define two matrices (same size)
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] B = {
            {4, 5, 6},
            {7, 8, 9}
        };

        // Step 2: Get the number of rows and columns
        int rows = A.length;       // Number of rows
        int cols = A[0].length;    // Number of columns

        // Step 3: Create an empty matrix to store the sum
        int[][] C = new int[rows][cols];

        // Step 4: Compute the sum of matrices
        for (int i = 0; i < rows; i++) {      // Loop through rows
            for (int j = 0; j < cols; j++) {  // Loop through columns
                C[i][j] = A[i][j] + B[i][j];  // Add corresponding elements
            }
        }

        // Step 5: Print the resulting matrix
        System.out.println("Resultant Matrix (Sum):");
        for (int i = 0; i < rows; i++) {  // Loop through rows
            for (int j = 0; j < cols; j++) {  // Loop through columns
                System.out.print(C[i][j] + " "); // Print each element
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
