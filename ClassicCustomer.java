public class ClassicCustomer extends Customer
{
    private double interestRate;

    public ClassicCustomer(int cid,String cname,double balance,double interestRate)
    {
        super(cid,cname,balance); 
        this.interestRate=interestRate;
    }

    @Override
    public void display()
    {
        super.display();
        System.out.println("Interest Rate: "+interestRate);
    }

    @Override
    public void calInterest()
    {
        int time = 5;
        double si =(balance*interestRate*time)/100;
        System.out.println("Simple Interest: "+si);
        System.out.println("Total Balance: "+(si+balance));
    }
}