public class VotingApp{
	
	public void validate(int age) throws InvalidAgeException{
		if(age<18)
			throw new InvalidAgeException("under age");
		else
			System.out.println("Welcome to Vote");
	}
   
    public static void main(String[] args) throws InvalidAgeException{
    	VotingApp voting = new VotingApp();

       try{
    	voting.validate(21);
    	voting.validate(16);
        }
        catch(ArithmeticException e){ 
        	System.out.println(e);
        }

        finally{
        	System.out.println("finally is always executed");
        }

        System.out.println("Rest of the code follows.....");
       
    }
}