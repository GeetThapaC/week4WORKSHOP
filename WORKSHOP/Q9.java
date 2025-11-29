import java.util.Scanner;

/**
 * Write a description of class Q9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q9
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter GPA: ");
        double gpa = input.nextDouble();

        System.out.print("Enter Attendance (%): ");
        double attendance = input.nextDouble();

        System.out.print("Enter Attitude Score (1–10): ");
        int attitude = input.nextInt();

        // Using nested if statements
        if (gpa >= 3.2) {
            if (attendance > 80) {
                if (attitude < 5) {
                    System.out.println("The student is ELIGIBLE for the scholarship.");
                } else {
                    System.out.println("Not eligible: Attitude score must be less than 5.");
                }
            } else {
                System.out.println("Not eligible: Attendance must be above 80%.");
            }
        } else {
            System.out.println("Not eligible: GPA must be at least 3.2.");
        }
    }
}