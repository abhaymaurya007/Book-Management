package test;

import java.io.Serializable;

public class BookBean implements Serializable {
	   Integer BookID;
	   String BookName,BookAuthor;
	   Float  BookPrice;
	   Integer Bookqty;
	public BookBean() {
		super();
	}
	public Integer getBookID() {
		return BookID;
	}
	public void setBookID(Integer bookID) {
		BookID = bookID;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getBookAuthor() {
		return BookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		BookAuthor = bookAuthor;
	}
	public Float getBookPrice() {
		return BookPrice;
	}
	public void setBookPrice(Float bookPrice) {
		BookPrice = bookPrice;
	}
	public Integer getBookqty() {
		return Bookqty;
	}
	public void setBookqty(Integer bookqty) {
		Bookqty = bookqty;
	}
	   

}
