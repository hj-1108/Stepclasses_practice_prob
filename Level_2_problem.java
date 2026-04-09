import java.util.Scanner;

public class Level_2_problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] newSalaries = new double[10];
        double[] bonuses = new double[10];
        
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        // Input Loop with Validation
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.print(" Enter Salary: ");
            double sal = input.nextDouble();
            System.out.print(" Enter Years of Service: ");
            double years = input.nextDouble();

            if (sal < 0 || years < 0) {
                System.out.println(" Invalid input. Please enter positive values.");
                i--; // Decrement counter to repeat this index
            } else {
                salaries[i] = sal;
                yearsOfService[i] = years;
            }
        }

        // Calculation Loop
        for (int i = 0; i < 10; i++) {
            double bonusRate = (yearsOfService[i] > 5) ? 0.05 : 0.02;
            bonuses[i] = salaries[i] * bonusRate;
            newSalaries[i] = salaries[i] + bonuses[i];

            totalOldSalary += salaries[i];
            totalBonus += bonuses[i];
            totalNewSalary += newSalaries[i];
        }

        // Output Results
        System.out.println("\n--- Company Payout Summary ---");
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Paid: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}
