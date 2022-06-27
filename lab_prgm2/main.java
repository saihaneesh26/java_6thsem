package prgm2;
/*
 * Write a Java program using user-defined storage classes to create a book database and store it in a Collection List. 
 * Books collection should include title, author, publisher and price. 
 * Also write a method to sort the books in ascending order of price and store it in another List.
 * Maintain the book details with respect to an unique book id. 
 * Prompt for an author name and list all the books with the same author name. 
 * Create a new list holding all the book details with price greater than a user specified price. 
 * For a given a value by the user, find all the books that match either the whole or a part of the book title. 
 * Identify a publisher and print books from a particular publisher. 
 * Update the publisher details based on a title
 */
public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookList bl = new BookList();
		bl.getBooksWithTitle();
		bl.booksWithPriceGreaterThanSpecificPrice();
		bl.getBooksWithAuthor();
		bl.getBooksWithTitle();
		bl.sortWithPrice();
		bl.updateBook();
		bl.display();
	}

}
