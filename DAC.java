package in.cdac.hyd;

public class DAC{

	private int totalStrength;
	private String name;

    public DAC(int totalStrength, String name){
    	this.totalStrength = totalStrength;
    	this.name = name;
    }
    public void getDac(){
    	System.out.println("Name: "+name+"\tTotal: "+totalStrength);
    }

}