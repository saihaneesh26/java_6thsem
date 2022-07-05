package thread1;
import java.util.*;
public class numToString implements Runnable{
	private Thread t;
	String n ;
	HashMap<Integer,String> hm = new HashMap<Integer,String>();
	numToString(String n){
		this.n=n;
		hm.put(0, "zero");
		hm.put(1,"one");
		hm.put(2, "two");
		//all till 9
	}
	@Override
	public void run() {
		try {
			System.out.println("enter numer");
			
			char[] arr = n.toCharArray();
			
			for(int i=0;i<n.length();i++) {
				int a = Integer.parseInt(String.valueOf(arr[i]));
				System.out.println(a+"-"+hm.get(a));
			}
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	public void start() {
		if(t==null) {
			t = new Thread(this);
			t.start();
		}
	}
	public static void main(String args[]) {
		numToString p = new numToString("120");
		p.start();
	}
}
