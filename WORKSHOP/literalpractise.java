
/**
 * Write a description of class literalpractise here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class literalpractise
{public static void main(String[] args) {

        // Long literal (requires 'L' suffix)
        long population = 9867645370L;

        // Float literal (requires 'f' suffix)
        float price = 355.35f;

        // Char literal using a Unicode escape sequence (© symbol)
        char copyrightSymbol = '\u00A9';

        // Printing values
        System.out.println("Long literal value: " + population);
        System.out.println("Float literal value: " + price);
        System.out.println("Unicode Char literal: " + copyrightSymbol);
    }
}