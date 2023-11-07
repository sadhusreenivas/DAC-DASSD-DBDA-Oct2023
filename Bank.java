public class Bank implements RBI, TTP{
	
	final int cashback = 10;
	public void withdraw(){
		System.out.println("Withdraw success and you got cashback: "+cashback);
	}
	public void deposit(){
		System.out.println("Deposit success and you wl get interst @"+interest);
	}

	public void transfer(){
		System.out.println("Transfer success");
	}
    
    public void confirmTransaction(){
    	System.out.println("Transaction Confirmed");
    }

	public void disp(){
		System.out.println("This is so and so bank");
	}

	public static void main(String[] args) {
		RBI r = new Bank(); 
		r.withdraw();
		r.deposit();
		r.transfer();
        TTP t = new Bank();
        t.confirmTransaction();
		
		new Bank().disp();
	}
}