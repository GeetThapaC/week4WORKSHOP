import java.util.Scanner;

/**
 * Write a description of class Q3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number > 0) {
            System.out.println(number + " is POSITIVE.");
        }
        else if (number < 0) {
            System.out.println(number + " is NEGATIVE.");
        }
        else {
            System.out.println("The number is ZERO.");
        }
    }
}