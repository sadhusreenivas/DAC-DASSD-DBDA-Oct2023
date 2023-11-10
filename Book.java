package in.cdac.hyd;

import java.io.Serializable;

public class Book implements Serializable {

	private String bname;
	private String author;
	transient private double price; // default value  0.0
	private int pages;
	private static String publisher = "TMH";
	
	public Book(String bname, String author, double price, int pages) {
		this.bname = bname;
		this.author = author;
		this.price = price;
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "Book [bname=" + bname + "\tauthor=" + author + "\tprice=" + price + "\tpages=" + pages + "\tpublishing house="+publisher+"]";
	}
	
}


