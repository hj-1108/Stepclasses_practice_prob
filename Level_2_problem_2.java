import java.util.Scanner;

public class Level_2_problem_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input data
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age for " + names[i] + ": ");
            ages[i] = input.nextInt();
            System.out.print("Enter height for " + names[i] + ": ");
            heights[i] = input.nextDouble();
        }

        // Initialize markers with the first friend's data
        int youngestIdx = 0;
        int tallestIdx = 0;

        // Loop to find extremes
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIdx]) {
                youngestIdx = i;
            }
            if (heights[i] > heights[tallestIdx]) {
                tallestIdx = i;
            }
        }

        // Output Results
        System.out.println("\nResults:");
        System.out.println("The youngest friend is: " + names[youngestIdx] + " (" + ages[youngestIdx] + " years old)");
        System.out.println("The tallest friend is: " + names[tallestIdx] + " (" + heights[tallestIdx] + " cm/ft)");
    }
}
