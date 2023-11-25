import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMarks=0;
        System.out.println("Enter number of subjects: ");
        int NumberOfSubjects = scanner.nextInt();

        for(int i=0; i<NumberOfSubjects; i++){
            System.out.println("Enter marks of subject " + (i+1) + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }
        int AllSubTotal= NumberOfSubjects * 100;
        double percentage = (totalMarks * 100) / AllSubTotal;
        if (percentage >= 90){
            System.out.println("Grade A");
        }
        else if (percentage >= 80){
            System.out.println("Grade B");
        }
        else if (percentage >= 70){
            System.out.println("Grade C");
        }
        else if (percentage >= 60){
            System.out.println("Grade D");
        }
        else if (percentage >= 40){
            System.out.println("Grade E");
        }
        else {
            System.out.println("Grade F");
        }

        System.out.println("Total Marks of student in all subjects: " + totalMarks + " out of " + AllSubTotal);
        System.out.println("Percentage of student: " + percentage + "%");



    }

}
