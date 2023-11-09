package in;

public class DBDA{

	private int totalStrength;
	private String name;

    public DBDA(int totalStrength, String name){
    	this.totalStrength = totalStrength;
    	this.name = name;
    }
    public void getDbda(){
    	System.out.println("Name: "+name+"\tTotal: "+totalStrength);
    }

}