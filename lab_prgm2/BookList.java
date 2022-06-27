package prgm2;
import java.util.*;
public class BookList {
	public ArrayList<Book> list = new ArrayList<Book>();
	Scanner s = new Scanner(System.in);
	public BookList() {
		//Java program using user-defined storage classes to create a book database and store it in a Collection List
		int id=0;
		while(true) {
			System.out.println("Do u want to enter new Entry: yes [or] no");
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
				Book s = new Book(String.valueOf(id++),t,a,p,price);
				list.add(s);
			}
			else {
				break;
			}
		}
	}
	//Also write a method to sort the books in ascending order of price and store it in another List.
	public void sortWithPrice() {
		ArrayList<Book> sorted_list = new ArrayList<Book>(list);//init with old list
		Collections.sort(sorted_list,new Comparator<Book>() {

			@Override
			public int compare(Book b1, Book b2) {
				// TODO Auto-generated method stub
				if(b1.price<b2.price)
				{
					return 1; //donot sort
				}
				else if(b1.price==b2.price) {
					return 0;
				}
				else {
					return -1;//sort
				}
			}
		});
		System.out.println("Sorted List of books");
		for(Book i : sorted_list) {
			System.out.println(i);
		}
		System.out.println();
	}
	// Prompt for an author name and list all the books with the same author name. 
	public void getBooksWithAuthor() {
		System.out.println("enter author name:");
		String author = s.nextLine();
		for(Book i:list) {
			if(i.author.equals(author)) {
				System.out.println(i);
			}
		}
	}
	// Create a new list holding all the book details with price greater than a user specified price.
	public void booksWithPriceGreaterThanSpecificPrice() {
		System.out.println("enter Specific price to sort");
		double price = Double.parseDouble(s.nextLine());
		ArrayList<Book> new_list = new ArrayList<Book>();
		for(Book i : list) {
			if(i.price>price) {
				new_list.add(i);
			}
		}
		System.out.println("Books with price greater "+String.valueOf(price)+" are:");
		for(Book i : new_list) {
			System.out.println(i);;
		}
	}
  //For a given a value by the user, find all the books that match either the whole or a part of the book title.
	public void getBooksWithTitle() {
		System.out.println("Enter title to get books:");
		String title = s.nextLine();
		for(Book i: list) {
			if((i.title.toLowerCase()).matches(".*"+(title.toLowerCase())+".*")) {
				System.out.println(i);
			}
		}
	}
	//Identify a publisher and print books from a particular publisher.
	public void getBooksWithPublisher() {
		System.out.println("enter Publisher name:");
		String publisher = s.nextLine();
		for(Book i:list) {
			if(i.publisher.equals(publisher)) {
				System.out.println(i);
			}
			System.out.println();
		}
	}
	//Update the publisher details based on a title
	public void updateBook() {
		System.out.println("Enter title of book to change publisher");
		String t = s.nextLine();
		System.out.println("enter new publisher name");
		String n = s.nextLine();
		for(Book i:list) {
			if(i.title.equals(t))
				i.publisher=n;
		}
	}
	
	//display
	public void display() {
		System.out.println("All books ");
		for(Book i:list) {
			System.out.println(i);
		}
	}
}
