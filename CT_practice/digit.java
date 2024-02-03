import java.util.Scanner;

public class digit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a positive integer: ");
        int number = scanner.nextInt();

        int digitSum = calculateDigitSum(number);

        System.out.println("Digit sum: " + digitSum);
    }

    public static int calculateDigitSum(int num) {
        int sum = 0;
        
        while (num > 0 || sum > 9) {
            if (num == 0) {
                num = sum;
                sum = 0;
            }
            sum += num % 10;
            num /= 10;
        }
        
        return sum;
    }
}
