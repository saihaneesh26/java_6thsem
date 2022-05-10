package swings_customer;

public class Customer {
	
	String cid,username,pass;
	int phone;
	
	public Customer(String username,String pass,String cid,int phone) {
		this.cid = cid;
		this.phone = phone;
		this.pass = pass;
		this.username = username;
	}
	
	public String toString() {
		return "Username :"+username+"  CID: "+cid+"   PHONE: "+phone;
	}
}
