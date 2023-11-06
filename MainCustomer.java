public class MainCustomer
{
    public static void main(String[] args) 
    {
        Customer c1 = new Customer(123,"ABC",100000);
        c1.display();
        c1.calInterest();
        System.out.println();

        ClassicCustomer cc1 = new ClassicCustomer(321,"XYZ",100000,6.5);
        cc1.display();
        cc1.calInterest();
        System.out.println();

        System.out.println("Upcasting - RTP :");
        Customer c2 = new ClassicCustomer(321,"XYZ",20000,6.5); 
        c2.display(); // RTP
        c2.calInterest(); // RTP
    }
}