package telephone;
import java.util.*;
import telephone.*;
public class missedCallList {
		
	Scanner in = new Scanner(System.in);
	ArrayList<missedcall> mc = new ArrayList<missedcall>();
	
	public missedCallList() {
		System.out.println("Enter y to give missedcall ");
		while(true) {
			if(in.nextLine().equals("y")) {
				System.out.println("Enter number");
				long num = Long.parseLong(in.nextLine());
				if(mc.size() > 4) {
					mc.remove(0);
					
				}
				mc.add(new missedcall(num));
			}
			else {
				break;
			}
		}	
	}
	
	public void viewLog() {
		for(int i = 0; i < mc.size();) {
			System.out.println("Enter option "+(i+1)+" :\n delete this missedcall\n2Next\n3.display missedcall\n4.exit");
			int n = Integer.parseInt(in.nextLine());
			if(n == 2) {
				i++;
				
			}else if(n == 1) {
				mc.remove(mc.get(i));
				
			}else if(n ==3) {
				System.out.println(mc.get(i));
				
			}else {
				break;
			}
		}
	}
}
