import java.util.Scanner;
class SwitchDemo{
	 public static void main(String[] args) {
	 	Scanner in = new Scanner(System.in);// creating Scanner object
	 	int m1,m2,m3;
	 	System.out.println("Enter marks in 3 subjects");
	 	m1 = in.nextInt();
        m2 = in.nextInt();
        m3 = in.nextInt();

        if(m1<0 || m1>100 || m2<0 ||m2>100 ||m3<0|| m3>100){
        	System.out.println("Invalid Marks! Pls provide Valid Marks");
        	return;
        }

        if(m1<40 || m2<40 || m3<40){
        	System.out.println("FAIL");
        	return;
        }

        int per = (m1+m2+m3)/3;
        System.out.println("Percentage of Marks: "+per);
        
        switch(per/10){
        	case 10:
        	case 9: System.out.println("Grade: A+");
        	        break;
        	case 8:
        	case 7: System.out.println("Grade: A");
        	        break;
        	case 6: System.out.println("Grade: B");
        	        break;
        	case 5: System.out.println("Grade: C");
        	        break;
        	case 4: System.out.println("Grade D");
        	        break;
        	case 3:
        	case 2:
        	case 1:
        	case 0: System.out.println("FAIL");
        	        break;
        	default: System.out.println("Please provide valid data!");
        }
        

	 }
}