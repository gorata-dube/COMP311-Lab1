import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Read the temperature in Celsius
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = sc.nextDouble();

        // Convert Celsius to Fahrenheit
        double fahrenheit = celsius * 9.0 / 5 + 32;

        // Display the result
        System.out.println(celsius + " degrees Celsius is "
                + fahrenheit + " degrees Fahrenheit.");

        sc.close();
    }
}