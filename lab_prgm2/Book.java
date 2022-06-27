package prgm2;
//Books collection should include title, author, publisher and price. 
public class Book {
	String title, author, publisher,id;
	double price;
	public Book(String id,String t,String a,String p,double price) {
		this.title = t;
		this.id = id;
		this.author = a;
		this.price = price;
		this.publisher = p;
	}
	public String toString() {
		return "ID: "+id+"\nTitle: "+title+"\nAuthor:"+author+"\nPublisher"+publisher+"\nprice:"+String.valueOf(price);
	}
}
