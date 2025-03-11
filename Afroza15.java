public class Afroza15 {
        // Function to print the zigzag traversal of a 2D array
        public static void zigzagTraversal(int[][] matrix) {
            if (matrix == null || matrix.length == 0) {
                return;
            }
    
            int rows = matrix.length;
            int cols = matrix[0].length;
    
            // Traverse the matrix row by row
            for (int i = 0; i < rows; i++) {
                // If the row index is even, traverse from left to right
                if (i % 2 == 0) {
                    for (int j = 0; j < cols; j++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                } else {
                    // If the row index is odd, traverse from right to left
                    for (int j = cols - 1; j >= 0; j--) {
                        System.out.print(matrix[i][j] + " ");
                    }
                }
            }
        }
    
        public static void main(String[] args) {
            // Example 2D array
            int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
    
            // Call the zigzag traversal function
            zigzagTraversal(matrix);
        }
    }

