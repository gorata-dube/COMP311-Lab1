import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Read a full sentence
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Use String methods to inspect and transform the sentence
        int length = sentence.length();
        String upperCase = sentence.toUpperCase();
        String lowerCase = sentence.toLowerCase();
        boolean containsJava = sentence.contains("Java");

        // Display the results
        System.out.println("Length: " + length);
        System.out.println("Upper case: " + upperCase);
        System.out.println("Lower case: " + lowerCase);
        System.out.println("Contains \"Java\": " + containsJava);

        sc.close();
    }
}