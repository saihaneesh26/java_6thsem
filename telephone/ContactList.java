package Phone;
import java.util.*;

public class ContactList {
	Scanner s = new Scanner(System.in);
	static ArrayList<Contacts> clist = new ArrayList<Contacts>();
	public ContactList() {
		clist.add(new Contacts(1,"a"));
		clist.add(new Contacts(2,"b"));
		clist.add(new Contacts(3,"c"));
		clist.add(new Contacts(4,"d"));
		clist.add(new Contacts(5,"e"));
		clist.add(new Contacts(6,"f"));
	}	
	public static ArrayList<Contacts> getclist(){
		return clist;
	}
}
