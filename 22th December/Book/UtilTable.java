package Util.com;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Book_us")    // table name  
public class UtilTable {
	@Id                                                // for primary key 
	private int bookid;                       // taking variables 
	private String Bname;                  // taking variables 
	private String author;                     // taking variables 
	private int price;                                 // taking variables 
	public int getPrice() {                          // get price 
		return price;
	}
	public void setPrice(int price) {    // set price 
		this.price = price;
	}
	public int getBookid() {             // get book id 
		return bookid;
	}
	public void setBookid(int bookid) {             // set book id 
		this.bookid = bookid;
	}
	public String getBname() {                                 // get book name 
		return Bname;
	}
	public void setBname(String bname) {      // set book name 
		Bname = bname;
	}
	public String getAuthor() {                           // get author name 
		return author;
	}
	public void setAuthor(String author) {              // set author name 
		this.author = author;
	}
	public String toString() {                                    // to return details  
		return "UtilTable [bookid=" + bookid + ", Bname=" + Bname + ", author=" + author + "]";
	}

}
