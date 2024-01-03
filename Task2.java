import java.util.Scanner;

/**
 * Task2
 */
public class Task2 {
    public static void studentG()
    {
        Scanner scanner = new Scanner(System.in);
        int totalSub;
        double totalMks = 0;
        double averagePrc;
        
        System.out.print("Enter the number of subjects: ");
        totalSub = scanner.nextInt();
        
        for (int i = 1; i <= totalSub; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            double marks = scanner.nextDouble();
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Marks should be between 0 and 100.");
                i--; 
                continue;
            }
            
            totalMks += marks;
        }
        averagePrc = (totalMks / (totalSub * 100)) * 100;
        String grade;
        if (averagePrc >= 90) {
            grade = "A";
        } else if (averagePrc >= 80) {
            grade = "B";
        } else if (averagePrc >= 70) {
            grade = "C";
        } else if (averagePrc >= 60) {
            grade = "D";
        } else if (averagePrc >= 50) {
            grade = "E";
        } else {
            grade = "F";
        }
        System.out.println("\nTotal Marks Obtained: " + totalMks);
        System.out.println("Average Percentage: " + averagePrc + "%");
        System.out.println("Grade: " + grade);
    }
    public static void main(String[] args) {
        studentG();
    }
    
}