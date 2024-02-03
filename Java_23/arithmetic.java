import java.util.*;
public class arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        n= sc.nextInt();
        m= sc.nextInt();
        int sum = n+m;
        int sub = n-m;
        int mul = n*m;
        try {
            int div= n/m;
            System.out.println("Summation : "+sum);
            System.out.println("Substraction : "+sub);
            System.out.println("Multiplication : "+mul);
            System.out.println("Division : "+div);
            
        } catch (Exception e) {
            System.out.println("Divisor can't be zero "+"the exception is "+e);
        }

    }
}
