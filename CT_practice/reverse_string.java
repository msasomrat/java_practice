import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input string from the user
        System.out.print("Input a string: ");
        String input = scanner.nextLine();

        // Split the input string into words
        String[] words = input.split(" ");

        // Reconstruct the sentence in reverse order
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }

        // Remove the trailing space and output the result
        String result = reversedSentence.toString().trim();
        System.out.println("Result: " + result);
    }
}
