package praticesPrograms;

class Bank {
	String accname = "vamshi";
	long accnum = 1234567891;
	double balance = 200;

	void details() {
		System.out.println("Account Name:" + accname + "Account Number:" + accnum);
	}
}
	class Deposit extends Bank {
		double amount = 5222.2;

		void depositamount() {
			balance = balance + amount;
			System.out.println("Toatal balance deposite:" + balance);
		}

	}


	public class SingleInheritance {

		public static void main(String[] args) {
			Deposit d1 = new Deposit();
			d1.details();
			d1.depositamount();
		
	
	}
}
