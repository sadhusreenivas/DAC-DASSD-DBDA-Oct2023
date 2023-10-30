class SwitchString{
	
	public static void main(String[] args) {
		
         String color = args[0];

		 switch(color.toLowerCase()){

		 	case "red": System.out.println("Sun is red");
		 	            break;
		 	case "green": System.out.println("Earth is Green");
		 	            break;
		 	case "blue": System.out.println("Sky is blue");
		 	            break;

		 	default: System.out.println("Only R_G_B");
		 }
	}
}