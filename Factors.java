class Factors{
	
	public static void main(String[] args) {
		
		int n = 1 + (int) (Math.random()*10000000); // 1-100
        System.out.println(n);
		int cnt = 0;

		for(int i = 1; i<=n; i++){
            if(n%i==0){
            	System.out.println("Factor: "+i);
            	cnt++;
            }
		}
	System.out.println("Count of Factors: "+cnt);
}}