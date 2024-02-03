//package CT_practice.multiplier;
import java.util.Scanner;

public class multiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input the second number: ");
        int num2 = scanner.nextInt();

        int result = multiplier.multiply(num1, num2);

        System.out.println("Result: " + result);
    }
}
class multiplier {
    public static int multiply(int num1, int num2) {
        int result = 0;
        for (int i = 0; i < num2; i++) {
            result += num1;
        }
        return result;
}
}


