package telephone;
import java.util.*;
import telephone.contacts;

public class contactList {

	Scanner in = new Scanner(System.in);
	static ArrayList<telephone.contacts> c = new ArrayList<telephone.contacts>();
	public contactList(){
		while(true) {
			System.out.println("Enter 1 to enter else 0");
			if(in.nextLine() == "1") {
				System.out.println("Enter name ");
				String name = in.nextLine();
				System.out.println("Enter phno ");
				long phno = in.nextLong();
				in.nextLine();
				telephone.contacts cs = new telephone.contacts(name, phno);
				c.add(cs);
				
				
			}else {
				break;
			}
		}
	}
	public static ArrayList<contacts> getclist(){
		return c;
	}
}
