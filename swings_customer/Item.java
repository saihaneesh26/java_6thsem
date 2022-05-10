package swings_customer;

public class Item {
	String name;
	int quantity;
	double price,total=0;
public Item(String name,int q,double p) {
	this.name = name;
	this.quantity = q;
	this.price = p;
	this.total = p*q;
}
public String toString() {
	
	return "ITEM"+this.name+ " PRICE:"+ this.price +" QUANTITY:"+this.quantity+" TOTAL:"+this.total+"\n";		
	
}
}
