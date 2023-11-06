public class Customer
{
    private int cid;
    private String cname;
    protected double balance;
    private static String bank="SBI";
    
    public Customer(int cid,String cname,double balance)
    {
        this.cid=cid;
        this.cname=cname;
        this.balance=balance;
    }

    public void display()
    {
        System.out.println("Customer ID: "+cid);
        System.out.println("Customer Name: "+cname);
        System.out.println("Bank Name: "+bank);
        System.out.println("Bank Balance: "+balance);
    }

    public void calInterest()
    {
        double rate = 4.5;
        int time = 5;
        double si =(balance*rate*time)/100;
        System.out.println("Simple Interest: "+si);
        System.out.println("Total Balance: "+(si+balance));
    }    
}