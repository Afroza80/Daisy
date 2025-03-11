public class Afroza11 {
    public static void main(String[] args) {
        // Step 1: Define a 2D matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Step 2: Call the function to print in spiral order
        System.out.println("Spiral Order:");
        printSpiral(matrix);
    }

    // Function to print a matrix in spiral order
    public static void printSpiral(int[][] matrix) {
        int top = 0, bottom = matrix.length - 1;  // Top & bottom row indexes
        int left = 0, right = matrix[0].length - 1; // Left & right column indexes

        while (top <= bottom && left <= right) {
            // Step 3: Print top row (left to right)
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;  // Move top row down

            // Step 4: Print right column (top to bottom)
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;  // Move right column left

            // Step 5: Print bottom row (right to left) if not already printed
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;  // Move bottom row up
            }

            // Step 6: Print left column (bottom to top) if not already printed
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;  // Move left column right
            }
        }
    }
}

