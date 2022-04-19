package telephone;
import telephone.*;

public class contacts {
	long phno;
	String name;
	
	
	public contacts(String name,long phno) {
		this.name = name;
		this.phno = phno;
	}
	
	public String toString() {
		return "name "+name+" phno "+phno;
	}
}
