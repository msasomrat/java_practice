
import java.util.*;
public class negative_thrown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        while (true) {
            System.out.print("Enter a number (enter 0 to exit): ");
            n = scanner.nextInt();

            if (n == 0) {
                break; // Exit the loop when 0 is entered
            }
            else if (n < 0) {
                try {
                    throw new NegativeNumberException("Negative number encountered: " + n);
                } catch (NegativeNumberException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } else {
                System.out.println("You entered a non-negative number: " + n);
            }
        }
        
        scanner.close();
    }

    }

    class NegativeNumberException extends Exception{
        public NegativeNumberException(String number)
        {
            super(number);
        }  
    }


    