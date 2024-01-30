import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double A_GRADE = 90.0;
        final double B_GRADE = 80.0;
        final double C_GRADE = 70.0;
        final double D_GRADE = 60.0;

        System.out.println("Enter the number of subjects:");
        int numSubjects = scanner.nextInt();

        System.out.println("Enter marks (out of 100) for each subject:");

        int totalMarks = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Subject " + i + ": ");
            int marks = scanner.nextInt();

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Marks should be between 0 and 100.");
                return;
            }

            totalMarks += marks;
        }
    
        double averagePercentage = (double) totalMarks / numSubjects;

        char grade;
        if (averagePercentage >= A_GRADE) {
            grade = 'A';
        } else if (averagePercentage >= B_GRADE) {
            grade = 'B';
        } else if (averagePercentage >= C_GRADE) {
            grade = 'C';
        } else if (averagePercentage >= D_GRADE) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
