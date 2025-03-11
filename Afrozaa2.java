public class Afrozaa2 {
    public static void main(String[] args) {
        // Step 1: Declare and initialize a 2D array
        int[][] numbers = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Step 2: Initialize sum variable
        int sum = 0;

        // Step 3: Traverse the 2D array using nested loops
        for (int i = 0; i < numbers.length; i++) { // Loop through rows
            for (int j = 0; j < numbers[i].length; j++) { // Loop through columns
                sum += numbers[i][j]; // Add each element to sum
            }
        }

        // Step 4: Print the result
        System.out.println("Sum of all elements: " + sum);
    }
}


 

