import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Ask the user for their name
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Ask the user for their age
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Calculate the age in five years
        int ageInFiveYears = age + 5;

        // Display the personalised message
        System.out.println("Hello " + name + "! In five years, you will be "
                + ageInFiveYears + " years old.");

        sc.close();
    }
}