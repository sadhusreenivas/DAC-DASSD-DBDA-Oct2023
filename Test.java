package cdachyd;

import in.cdac.hyd.*; // DAC
import in.cdac.DASSD; // DASSD

public class Test{
	public static void main(String[] args) {
		
     //access DAC - implicit
		DAC dac = new DAC(100, "PG-DAC");
		dac.getDac();

	 //access DAC - explicit
        DASSD dassd = new DASSD(22, "PG-DASSD");
        dassd.getDassd();

     // access using FQN
       in.DBDA dbda = new in.DBDA(31,"PG-DBDA");
       dbda.getDbda();   
 
	}
}