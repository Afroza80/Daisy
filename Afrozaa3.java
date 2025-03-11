public class Afrozaa3 {
    public static void main(String[] args) {
        // Step 1: Declare and initialize a 2D array
        int[][] numbers = {
            {3, 8, 1},
            {7, 2, 9},
            {5, 4, 6}
        };

        // Step 2: Assume first element is both max and min
        int max = numbers[0][0];
        int min = numbers[0][0];

        // Step 3: Traverse the 2D array to find max and min
        for (int i = 0; i < numbers.length; i++) { // Rows
            for (int j = 0; j < numbers[i].length; j++) { // Columns
                if (numbers[i][j] > max) { 
                    max = numbers[i][j]; // Update max
                }
                if (numbers[i][j] < min) {
                    min = numbers[i][j]; // Update min
                }
            }
        }

        // Step 4: Print results
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}


