import java.util.Scanner;

/**
 * Write a description of class evenorodd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class evenorodd
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check even or odd using modulus operator
        if (number % 2 == 0) {
            System.out.println(number + " is EVEN.");
        } else {
            System.out.println(number + " is ODD.");
        }
    }
}


    