package multithreading;

public class ITCCustomer {
	double balance;

	public ITCCustomer(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public synchronized void withdraw(double amt) {
		System.out.println("Going to withdraw....");
		if(amt > balance) {
			System.out.println("Less Balance....."+ getBalance());
			System.out.println("Waiting for Deposit");
			try {
				wait(); // blocked state
			}catch(Exception e) {System.out.println(e);}
		}
		
		balance = balance - amt;
		System.out.println("Withdraw success");
		System.out.println("Net Balance: "+getBalance());
		
	}
	
	public synchronized void deposit(double amt) {
		System.out.println("Going to Deposit");
		balance = balance + amt;
		System.out.println("Depoisted Successfully");
		System.out.println("Net Balance: "+getBalance());
		notify();
	}

	public static void main(String[] args) {
		
		ITCCustomer c1 = new ITCCustomer(10000);
		
		new Thread() {
			public void run() {
				c1.withdraw(25000);
			}
		}.start();
		
		new Thread() {
			public void run() {
				c1.deposit(20000);
			}
		}.start();
	}
	
}
