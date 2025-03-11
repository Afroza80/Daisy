
    public class Afroza9 {
        public static void main(String[] args) {
            // Step 1: Define a square matrix
            int[][] matrix = {
                {1, 2, 3},
                {2, 4, 5},
                {3, 5, 6}
            };
    
            // Step 2: Check if matrix is symmetric
            if (isSymmetric(matrix)) {
                System.out.println("The matrix is symmetric.");
            } else {
                System.out.println("The matrix is not symmetric.");
            }
        }
    
        // Function to check if matrix is symmetric
        public static boolean isSymmetric(int[][] matrix) {
            int n = matrix.length; // Get the number of rows (square matrix)
            
            // Step 3: Compare elements with their transpose
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] != matrix[j][i]) {
                        return false; // Not symmetric
                    }
                }
            }
            return true; // Symmetric
    
        }
    }


