public class SBI extends ATM{
	
	void withdraw(){
      System.out.println("withdraw success");
	}

   void transfer(){
      System.out.println("transferred the amount");
    }

    @Override
    public void disp(){
    	System.out.println("Im a SBI");
    }

    void xyz(){
    	System.out.println("ABC");
    }

    public static void main(String[] args) {
    	
    	ATM a = new SBI();
    	a.withdraw();
    	a.transfer();
    	a.disp();
        
    	new SBI().xyz(); //

    }

}