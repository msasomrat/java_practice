import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a string: ");
        String input = scan.nextLine();
        hello3.concat(input);
    }
}

class hello4 {
    public static void rev(String s) {
        int size_s = s.length();
        for (int x = size_s - 1; x >= 0; x--) {
            System.out.print(s.charAt(x));
        }
    }
}

class hello3 {
    public static void concat(String s) {
        int size_s = s.length();
        String word = "";
        for (int x = size_s - 1; x >= 0; x--) {
            char ch = s.charAt(x);
            if (ch == ' ') {
                hello4.rev(word);
                word = "";
                System.out.print(" ");
            } else {
                word = word + ch;
            }
        }
        hello4.rev(word);
    }
}
