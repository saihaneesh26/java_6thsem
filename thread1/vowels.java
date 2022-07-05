package thread1;
import java.util.*;
public class vowels implements Runnable{
	private Thread t;
	String name;
	ArrayList<String> vow = new ArrayList<String>();
	vowels(String name){
		this.name = name;
		vow.add("a");
		vow.add("e");
		vow.add("i");
		vow.add("o");
		vow.add("u");
	}
	public void run() {
		try {
			int res=0;
			char[] name_char = name.toCharArray();
			for(int i=0;i<name.length();i++) {
				String s = (String.valueOf(name_char[i]));
				if(vow.contains(s.toLowerCase())){
					res+=1;
				}
			}
			System.out.println("no of vowels:"+res);
		}catch(Exception e) {
			System.out.println("exiting");
		}
	}
	public void start() {
		if(t==null) {
			t = new Thread(this);
			t.start();
		}
	}
	public static void main(String args[]) {
		vowels p = new vowels("aa");
		p.start();
	}
	
}
