package coreJava;
class Account{
	String customerName;
	int accountNo;
	Account(String a, int b){
		customerName = a;
		accountNo = b;
	}
	void display() {
		System.out.println("CustomerName:"+customerName);
		System.out.println("Account No:"+accountNo);
	}
}
class CurrentAccount extends Account
{
	int currentBallance;
	CurrentAccount(String a, int b, int c)
	{
		super(a,b);
		int currentBalance = c;
	}
	void display()
	{
		super.display();
		String currentBalance = null;
		System.out.println("Current Balance:"+currentBalance);
	}
}
class AccountDetails extends CurrentAccount {
	int depositAmount, withdrawalAmount;
	AccountDetails(String a, int b, int c, int d, int e){
		super(a,b,c);
		depositAmount=d;
		withdrawalAmount = e;
		}
	void display() {
		super.display();
		System.out.println("Deposit Amount:"+depositAmount);
		System.out.println("Withdrawal Amount:"+withdrawalAmount);
	}
}
class Main{
	public static void main(String args[]) {
		AccountDetails A = new AccountDetails("Vilas", 12345, 10000, 3000, 40000);
		A.display();
	}
}