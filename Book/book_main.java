package Book;

public class Book {
	String title,author,publisher;
	double price;
	public Book(String t,String a,String p,double pr) {
		this.author =a;
		this.price = pr;
		this.publisher = p;
		this.title = t;
	}
	public String toString() {
		return "Author "+author+" Title "+title+" Publisher "+publisher+" price "+price;
	}
}
