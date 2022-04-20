package praticesPrograms;

class Banks {
	String accname = "vamshi";
	long accnum = 1234567891;
	double balance = 200;

	void details() {
		System.out.println("Account Name: " + accname  + "Account Number:" + accnum);
	}
}

class Deposits extends Bank {
	double amount = 5222.2;

	void depositamount() {
		balance = balance + amount;
		System.out.println("Toatal balance deposite:" + balance);
	}

}

class withdraw extends Deposits {
	int withdrawamount = 250;

	public void withdrawamount() {
		balance = balance - withdrawamount;
		System.out.println(" Amount withdraw for bank:" + withdrawamount);
	}

}

public class MuitiInhertiance {

	public static void main(String[] args) {
		withdraw w1 = new withdraw();
		w1.details();
		w1.depositamount();
		w1.withdrawamount();

	}

}
