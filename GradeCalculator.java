import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter marks obtained (out of 100) in each subject:");

        int numberOfSubjects;
        do {
            System.out.print("Enter the number of subjects: ");
            numberOfSubjects = scanner.nextInt();
        } while (numberOfSubjects <= 0);

        int[] subjectMarks = new int[numberOfSubjects];
        int totalMarks = 0;

        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            subjectMarks[i] = scanner.nextInt();

           
            subjectMarks[i] = Math.max(0, Math.min(100, subjectMarks[i]));

            totalMarks += subjectMarks[i];
        }

        
       
        double averagePercentage = (double) totalMarks / numberOfSubjects;

       
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
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

