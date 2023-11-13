package multithreading;

public class Display {

	synchronized public void dispLowerCase() {
		for(int i=97;i<=122;i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {System.out.println(e);}
		}
	}
	
	synchronized public void dispUpperCase() {
		for(int i=65;i<=90;i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {System.out.println(e);}
		}
	}
	
	synchronized public void dispNumbers() {
		for(int i=1;i<=26;i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {System.out.println(e);}
		}
	}
}
