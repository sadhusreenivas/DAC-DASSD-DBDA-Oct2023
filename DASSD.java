package in.cdac;

public class DASSD{

	private int totalStrength;
	private String name;

    public DASSD(int totalStrength, String name){
    	this.totalStrength = totalStrength;
    	this.name = name;
    }
    public void getDassd(){
    	System.out.println("Name: "+name+"\tTotal: "+totalStrength);
    }

}