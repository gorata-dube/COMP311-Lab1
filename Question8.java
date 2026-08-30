import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Read the length and width
        System.out.print("Enter the length: ");
        double length = sc.nextDouble();

        System.out.print("Enter the width: ");
        double width = sc.nextDouble();

        // Calculate the area and perimeter
        double area = length * width;
        double perimeter = 2 * (length + width);

        // Display the results
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

        sc.close();
    }
}