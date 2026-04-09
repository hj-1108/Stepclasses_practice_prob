import java.util.Scanner;

public class Level_3_problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        long number = input.nextLong();
        
        // Handle negative numbers and convert to string for digit count
        long temp = Math.abs(number);
        String numStr = Long.toString(temp);
        int digitCount = numStr.length();
        
        // Define arrays for digits and frequency
        int[] digits = new int[digitCount];
        int[] frequency = new int[10]; // Indices 0-9 represent digits
        
        // Extract digits and save them in the digits array
        long extractionTemp = temp;
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = (int)(extractionTemp % 10);
            extractionTemp /= 10;
        }
        
        // Loop through the digits array to increase the frequency
        for (int i = 0; i < digits.length; i++) {
            int currentDigit = digits[i];
            frequency[currentDigit]++;
        }
        
        // Display the frequency of each digit present in the number
        System.out.println("Frequency of each digit:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
    }
}
