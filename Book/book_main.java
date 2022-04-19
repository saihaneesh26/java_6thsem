package Book;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookList bl = new BookList();
		bl.getBooks("a1");
		bl.getBookswithPrice(10);
		bl.getBooksWithPublisher("p1");
		bl.getBookWithTitle("t1");
		bl.SortPrice();
		bl.updateBook("t1");
		bl.display();
	}

}
