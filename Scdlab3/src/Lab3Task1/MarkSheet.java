package Lab3Task1;
import java.util.Scanner;

public class MarkSheet {
	private String studentName;
    private double totalMarks;
    private double obtainedMarks;
    
    public MarkSheet(String studentName, double totalMarks, double obtainedMarks) {
        this.studentName = studentName;
        this.totalMarks = totalMarks;
        this.obtainedMarks = obtainedMarks;
    }

    private double calculatePercentage() {
        return (obtainedMarks / totalMarks) * 100;
    }
    
    private String calculateGrade() {
        double percentage = calculatePercentage();

        if (percentage >= 90) return "A+";
        else if (percentage >= 80) return "A";
        else if (percentage >= 75) return "B+";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else return "F";
    }

    private double calculateGPA() {
        String grade = calculateGrade();

        switch (grade) {
            case "A+": return 4.0;
            case "A": return 3.7;
            case "B+": return 3.33;
            case "B": return 3.0;
            case "C": return 2.0;
            case "D": return 1.0;
            default: return 0.0;
        }
    }
    public void displayMarkSheet() {
        System.out.println("Mark Sheet:");
        System.out.println("Student Name  : " + studentName);
        System.out.println("Total Marks   : " + totalMarks);
        System.out.println("Obtained Marks: " + obtainedMarks);
        System.out.println("Percentage    : " + calculatePercentage() + "%");
        System.out.println("Grade         : " + calculateGrade());
        System.out.println("GPA           : " + calculateGPA());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Total Marks: ");
        double totalMarks = scanner.nextDouble();

        System.out.print("Enter Obtained Marks: ");
        double obtainedMarks = scanner.nextDouble();

        MarkSheet markSheet = new MarkSheet(name, totalMarks, obtainedMarks);
        markSheet.displayMarkSheet();

        scanner.close();
    }
}
