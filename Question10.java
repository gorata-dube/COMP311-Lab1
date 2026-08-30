import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Read the person's full name
        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine();

        // Find the position of the space between the first name and surname
        int spacePosition = fullName.indexOf(' ');

        // Extract the first name and surname
        String firstName = fullName.substring(0, spacePosition);
        String surname = fullName.substring(spacePosition + 1);

        // Get the first letter of each name and convert it to uppercase
        String firstInitial = firstName.substring(0, 1).toUpperCase();
        String surnameInitial = surname.substring(0, 1).toUpperCase();

        // Combine the initials
        String initials = firstInitial + "." + surnameInitial + ".";

        // Display the results
        System.out.println("First name: " + firstName);
        System.out.println("Surname: " + surname);
        System.out.println("Initials: " + initials);

        sc.close();
    }
}