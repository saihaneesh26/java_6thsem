package telephone;
import telephone.*;
import java.time.LocalDateTime;
public class missedcall {
	String name = "private caller";
	long phno;
	LocalDateTime t;
	public missedcall(long phno) {
		
		this.phno = phno;
		this.t = LocalDateTime.now();
		
		for(contacts i:contactList.getclist()) {
			if(i.name.contentEquals(name)) {
				this.name = i.name;
				break;
				
			}
		}
		
	}
	public String toString() {
		return "name "+name+" phno "+phno+" time "+t;
	}
}
