import java.util.Scanner;

/**
 * Write a description of class Q4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q4
{ 
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check divisibility by both 3 and 5
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println(number + " is divisible by BOTH 3 and 5.");
        } else {
            System.out.println(number + " is NOT divisible by both 3 and 5.");
        }
    }
}