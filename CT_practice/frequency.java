import java.util.Scanner;

public class frequency{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input text from the user
        System.out.print("Input a text in a line: ");
        String inputText = scanner.nextLine();
        
        // Split input text into words
        String[] words = inputText.split("\\s+");
        
        // Initialize variables to store most frequent word and word with maximum length
        String mostFrequentWord = "";
        String wordWithMaxLength = "";
        int maxFrequency = 0;
        
        // Iterate through words and find most frequent word and word with maximum length
        for (String word : words) {
            // Remove non-alphabetic characters from words (keeping only letters)
            word = word.replaceAll("[^a-zA-Z]", "");
            
            // Check for most frequent word
            int frequency = 0;
            for (String w : words) {
                if (w.equalsIgnoreCase(word)) {
                    frequency++;
                }
            }
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mostFrequentWord = word;
            }
            
            // Check for word with maximum length
            if (word.length() > wordWithMaxLength.length()) {
                wordWithMaxLength = word;
            }
        }
        
        // Output the results
        System.out.println("Most frequent word is: " + mostFrequentWord);
        System.out.println("Word with maximum length: " + wordWithMaxLength);
    }
}
