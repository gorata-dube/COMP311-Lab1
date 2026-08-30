import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Read three test scores
        System.out.print("Enter three scores: ");
        double score1 = sc.nextDouble();
        double score2 = sc.nextDouble();
        double score3 = sc.nextDouble();

        // Calculate the average
        double average = (score1 + score2 + score3) / 3;

        // Display the average
        System.out.println("Average: " + average);

        sc.close();
    }
}