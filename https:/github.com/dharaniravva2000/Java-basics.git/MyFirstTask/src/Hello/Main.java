package Hello;

import java.util.Scanner;

public class Main {
    // Define the character set for encoding
    private static final String CHARSET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public static void main(String[] args) {
        // Read the input values
        Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split(" ");

        // Encode each value and concatenate the results
        StringBuilder result = new StringBuilder();
        for (String value : values) {
            // Convert the value to a string and reverse it
            String valueStr = new StringBuilder(value).reverse().toString();
            // Encode each digit in the reversed string
            for (char digit : valueStr.toCharArray()) {
                int index = Character.getNumericValue(digit);
                result.append(CHARSET.charAt(index));
            }
            // Add a separator between each encoded value
            result.append(" ");
        }

        // Remove the trailing separator and print the result
        System.out.println(result.toString().trim());
        
        scanner.close();
    }
}