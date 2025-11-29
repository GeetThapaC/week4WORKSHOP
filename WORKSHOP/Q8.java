import java.util.Scanner;

/**
 * Write a description of class Q8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter GPA (0.0 to 4.0): ");
        double gpa = sc.nextDouble();

        // Validate input
        if (gpa < 0.0 || gpa > 4.0)
        {
            System.out.println("Error: Invalid GPA! Please enter a value between 0.0 and 4.0.");
        }
        else
        {
            String grade;

            // GPA to grade conversion
            if (gpa >= 3.7)
                grade = "A";
            else if (gpa >= 3.0)
                grade = "B";
            else if (gpa >= 2.0)
                grade = "C";
            else if (gpa >= 1.0)
                grade = "D";
            else
                grade = "F";

            System.out.println("Your Grade is: " + grade);
        }
    }
}