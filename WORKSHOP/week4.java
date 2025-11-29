import java.util.Scanner;

/**
 * Write a description of class week4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week4
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the marks obtained by the student: ");
        int marks = sc.nextInt();

        if (marks >= 40) {
            System.out.println("The student has PASSED the examination.");
        } else {
            System.out.println("The student has FAILED the examination.");
        }
    }
}