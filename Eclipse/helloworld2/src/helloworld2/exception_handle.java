package helloworld2;

import java.util.InputMismatchException;
import java.util.Scanner;


class negative_number extends Exception{
	public negative_number(String message)
	{
		super(message);
	}
}

public class exception_handle{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		try {
			long n = sc.nextLong();
			if(n>=Integer.MAX_VALUE || n<= Integer.MIN_VALUE)
			{
				throw new negative_number("Out of bounds");
			}
			int m = sc.nextInt();
			
			int p =(int) n/m;
			System.out.println("Output"+ p);
			}
		catch(InputMismatchException e) {
			System.out.println(e.toString());
		}
		catch(ArithmeticException e) {
			System.out.println(e.toString());
		}
		catch(negative_number e) {
			System.out.println(e.toString());
		}
		finally
		{
				System.out.println("this is final");
		}
		
	}
}