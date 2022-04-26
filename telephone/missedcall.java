package Phone;
import java.time.LocalDateTime;
public class missedCall {
	String name = "Private Caller";
	int num;
	LocalDateTime d;
	public missedCall(int num) {
		this.num = num;
		this.d = LocalDateTime.now();
		for(Contacts i: ContactList.getclist()) {
			if(i.num==num) {
				this.name = i.name;
				break;
			}
		}
	}
	public String toString() {
		return "Name: "+name+" Phone: "+num +" Date: "+d;
	}
}
