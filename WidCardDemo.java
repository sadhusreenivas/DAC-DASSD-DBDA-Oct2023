package generics;

import java.util.ArrayList;
import java.util.List;

public class WidCardDemo {

    public static void drawShapes(List<? extends Shape> list) {
    
    	for(Shape s : list) {
    		s.draw();
    }
    }
  
	
	public static void main(String[] args) {
  	
        	List<Triangle> tlist = new ArrayList();
        	tlist.add(new Triangle());
        	tlist.add(new Triangle());
        	drawShapes(tlist);
        	
        	List<Rectangle> rlist = new ArrayList();
        	rlist.add(new Rectangle());
        	rlist.add(new Rectangle());
        	drawShapes(rlist);
        	
        	List<Circle> clist = new ArrayList();
        	clist.add(new Circle());
        	clist.add(new Circle());
        	drawShapes(clist);
		
        }

	}

