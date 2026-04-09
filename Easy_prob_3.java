import java.util.Scanner;

public class Easy_prob_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int[] tableResults = new int[10];

        // Store results in the array
        for (int i = 0; i < 10; i++) {
            tableResults[i] = number * (i + 1);
        }

        // Display results from the array
        for (int i = 0; i < tableResults.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + tableResults[i]);
        }
    }
}
