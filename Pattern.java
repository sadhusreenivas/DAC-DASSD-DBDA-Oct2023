class Pattern{
	
	public static void main(String[] args) {
		
		
         int x = 12;
		for(int i=1; i<=5;i++){
			System.out.println();

            for(int s=0; s<x; s++)
            	System.out.print(" ");

			for(int j=1; j<=i;j++){
				System.out.print(" *  ");	
			}

			x= x-2;
		}
	}
}