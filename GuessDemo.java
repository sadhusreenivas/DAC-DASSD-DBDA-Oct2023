import java.util.Scanner;
class GuessDemo{
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int randomNo = 1+(int)(Math.random()*100);
        System.out.println("Generate Number: "+randomNo);

        System.out.println("Guess the Number btw 1 to 100");
        int guessedNo = s.nextInt();

        while(randomNo != guessedNo){
         if(guessedNo < randomNo)
         	System.out.println("Too Low");
         else
         	System.out.println("Too High");

         System.out.println("Guess Again....");
         guessedNo = s.nextInt();
        }

        System.out.println("Congrats , You Won!");

	}
}