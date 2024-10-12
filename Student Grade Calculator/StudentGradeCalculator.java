import java.util.*;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Entered the marks obtained in each subject out of 100");
        System.out.println("------------------------------------------------");

        System.out.println("Enter the marks obtained in first language");
        int first = sc.nextInt();
        System.out.println("Enter the marks obtained in second language");
        int second = sc.nextInt();
        System.out.println("Enter the marks obtained in English");
        int english = sc.nextInt();
        System.out.println("Enter the marks obtained in Maths");
        int Maths = sc.nextInt();
        System.out.println("Enter the marks obtained in Science");
        int science = sc.nextInt();

        avg(first, second, english, Maths, science);

    }

    public static void avg(int first, int second, int english, int maths, int science) {
        int sum = first + second + english + maths + science;
        int percentage = (sum / 5);
        System.out.println("Total marks obtained " + sum);
        System.out.println("Percentage scored by the user " + percentage + "%");
        System.out.println("Grade of the user " + grade(percentage));
    }

    public static String grade(int percentage) {
        if (percentage < 35)
            return "Failed";
        else if (percentage == 35)
            return "Just Pass";
        else if (percentage > 35 && percentage <= 50)
            return "Average";
        else if (percentage > 50 && percentage <= 75)
            return "Good";
        else if (percentage > 75 && percentage <= 85)
            return "Very Good";
        else
            return "Great";
    }

}
