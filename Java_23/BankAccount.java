
public class BankAccount{
	String name;
	String number;
	double amount;
	BankAccount(String name, String number, double amount)
	{
		this.name = name;
		this.number = number;
		this.amount = amount;
		}
		public void withdraw(double amount)
		{
			this.amount -=amount;
		}
		public void insert(double amount)
			{
					this.amount +=amount;
		}
		public void display()
		{
			System.out.println("Account Holder: "+name);
			System.out.println("Account Number: "+number);
			System.out.println("Account Holder: "+amount);
		}

	public static void main(String[] args)
	{
		BankAccount account1 = new BankAccount("Hello", "1234", 1000.0);
		BankAccount account2 = new BankAccount("World", "4567", 500.0);
		account1.insert(500);
		account2.withdraw(300);

		account1.display();
        account2.insert(200);
        account2.withdraw(100);
		account2.display();

	}
}