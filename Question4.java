import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Read an integer
        System.out.print("Enter a whole number: ");
        int wholeNumber = sc.nextInt();

        // Read a decimal number
        System.out.print("Enter a decimal number: ");
        double decimalNumber = sc.nextDouble();

        // Read a single word
        System.out.print("Enter a single word: ");
        String word = sc.next();

        // Display all three values
        System.out.println("You entered " + wholeNumber + ", "
                + decimalNumber + ", and the word \"" + word + "\".");

        sc.close();
    }
}