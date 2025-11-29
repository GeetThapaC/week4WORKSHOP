import java.util.Scanner;

/**
 * Write a description of class Q7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q7
{ public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        float mp;        // Marked Price
        char category;   // Item Category
        float discount;  // Discount Percentage
        float sp;        // Selling Price

        System.out.print("Enter The Marked Price: ");
        mp = input.nextFloat();

        System.out.print("Enter The Item Category (A/B/C/D): ");
        category = input.next().toUpperCase().charAt(0);

        // Switch-case to assign discount
        switch (category)
        {
            case 'A':
                discount = 60;
                break;

            case 'B':
                discount = 40;
                break;

            case 'C':
                discount = 20;
                break;

            case 'D':
                discount = 10;
                break;

            default:
                System.out.println("Invalid Category!");
                return;
        }

        // Calculate selling price
        sp = mp - (mp * discount / 100);

        System.out.println("Discount: " + discount + "%");
        System.out.println("Selling Price: " + sp);
    }
}