package swings_book;
import java.util.*;

public class Book {
	String title;
	ArrayList<String> author;
	String edition;
	int volume;
	int quantity;
	float price;
	
	public Book(String title,ArrayList author,String edition,int volume,int quantity,float price) {
		this.title = title;
		this.author = new ArrayList(author);
		this.edition = edition;
		this.price = price;
		this.quantity = quantity;
		this.volume = volume;
	}
	
	public String toString(){
		return "title: "+title+"author: "+author+" edition: "+edition+" price: "+price+" quantity "+quantity;
	}
}
