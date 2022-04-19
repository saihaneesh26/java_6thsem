package Book;

import java.util.*;
public class BookList {
	ArrayList<Book> bl = new ArrayList<Book>();
	Scanner s = new Scanner(System.in);
	public BookList() {
		while(true) {
			System.out.println("Do u want to enter new Entry: ");
			if(s.nextLine().equals("yes")) {
				System.out.println("Author:");
				String a = s.nextLine();
				System.out.println("Title:");
				String t = s.nextLine();
				System.out.println("Publisher");
				String p = s.nextLine();
				System.out.println("price:");
				double price = s.nextDouble();
				s.nextLine();
				Book s = new Book(t,a,p,price);
				bl.add(s);
			}
			else {
				break;
			}
		}
	}
	
	public void SortPrice() {
		ArrayList<Book> nbl = new ArrayList<Book>(bl);
		Collections.sort(nbl, new Comparator<Book>() {
			public int compare(Book b1,Book b2) {
				if(b1.price>b2.price)return -1;
				if(b1.price==b2.price)return 0;
				else return 1;
			}
		});
		System.out.println("Sorted list based on price ascending order:");
		for(Book i:nbl) {
			System.out.println(i);
		}
	}
	public void getBooks(String author) {
		for(Book i:bl) {
			if(i.author.equals(author))
			System.out.println(i);
		}
	}
	public void getBookswithPrice(double p) {
		ArrayList<Book> pbl = new ArrayList<Book>();
		for(Book i:bl) {
			if(i.price>p)
				pbl.add(i);
		}
		System.out.println("Books with price greate than "+p);
		for(Book i:pbl) {
			System.out.println(i);
		}
	}
	public void getBookWithTitle(String n) {
		System.out.println("Books with Part of Title "+n);
		for(Book i:bl) {
			if(i.title.contains(n))
			System.out.println(i);
		}
	}
	public void getBooksWithPublisher(String p) {
		System.out.println("Books with publisher "+p);
		
		for(Book i:bl) {
			if(i.publisher.equals(p))
			System.out.println(i);
		}
	}
	public void updateBook(String t) {
		System.out.println("enter new publisher name");
		String n = s.nextLine();
		for(Book i:bl) {
			if(i.title.equals(t))
				i.publisher=n;
		}
	}
	public void display() {
		System.out.println("All books ");
		for(Book i:bl) {
			System.out.println(i);
		}
	}
}
