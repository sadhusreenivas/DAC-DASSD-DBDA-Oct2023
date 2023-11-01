import java.util.Scanner;
class TwoDDemo{
	public static void main(String[] args) {
	   Scanner s = new Scanner(System.in);
       int[][] m1 = new int[3][3];

       int sum = 0;
       //populate array
       for(int i=0;i<m1.length;i++){
       	for(int j=0;j<m1[i].length;j++){
          System.out.println("Enter elemnet");
          m1[i][j] = s.nextInt();
          if(i == j){
          	sum = sum + m1[i][j];
          }     
       	}
       }
       // printing 2-D array
        for(int i=0;i<m1.length;i++){
        System.out.println();
       	for(int j=0;j<m1[i].length;j++){
          System.out.print(m1[i][j]+" ");
        }
    }
       
       System.out.println("\nSum of Diagonal Elements: "+sum);
	}
}