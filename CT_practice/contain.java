import java.util.Scanner;

public class contain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Input second string: ");
        String secondString = scanner.nextLine();

        boolean containsSubstring = StringChecker.containsSubstring(firstString, secondString);

        System.out.println("If the second string contains the first one? " + (containsSubstring ? "Yes" : "No"));
    }
}
class StringChecker {
    public static boolean containsSubstring(String first, String second) {
        return second.contains(first);
    }
}
