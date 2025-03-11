public class Afroza12 {
    public static void main(String[] args) {
        // Step 1: Define a square matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Step 2: Call the function to rotate the matrix
        rotate90Clockwise(matrix);

        // Step 3: Print the rotated matrix
        System.out.println("Matrix after 90-degree rotation:");
        printMatrix(matrix);
    }

    // Function to rotate the matrix 90 degrees clockwise
    public static void rotate90Clockwise(int[][] matrix) {
        int n = matrix.length; // Matrix size

        // Step 4: Transpose the matrix (swap rows and columns)
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 5: Reverse each row to complete 90-degree rotation
        for (int i = 0; i < n; i++) {
            for (int j = 0, k = n - 1; j < k; j++, k--) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
            }
        }
    }

    // Function to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}



