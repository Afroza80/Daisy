public class Afroza1 {
    public static void main(String[] args) {
        // Step 1: Define a 2D array
        int[][] array = {
            {3, 4, 5},
            {6, 7, 8},
            {9, 10, 11}
        };

        // Step 2: Use nested loops to print the elements
        for (int i = 0; i < array.length; i++) { // Loop through rows
            for (int j = 0; j < array[i].length; j++) { // Loop through columns
                System.out.print(array[i][j] + " "); // Print each element
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}


