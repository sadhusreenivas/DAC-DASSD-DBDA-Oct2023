class Seasons{
	public static void main(String[] args) {	
     int monthNo = 1 + (int) (Math.random()*12); // 1-12
     System.out.println("Generated MonthNo: "+monthNo);
     switch(monthNo){
     	case 1:
     	case 2:
     	case 11:
     	case 12: System.out.println("Winter");
     	         break;
     	case 3: 
     	case 4:
     	case 5:
     	case 6: System.out.println("Summer");
                break;
        case 7:
        case 8:
        case 9:
        case 10: System.out.println("Rainy");
                 break;
        default: System.out.println("Please enter proper month nos (1-12)");
     }
	}
}