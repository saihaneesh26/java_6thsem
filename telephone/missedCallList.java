package Phone;
import java.util.*;
public class missedCallList {
	ArrayList<missedCall> mlist = new ArrayList<missedCall>();
	Scanner sc = new Scanner(System.in);
	public missedCallList() {
		while(true) {
			System.out.println("Enter y to give missedcall");
			if(sc.nextLine().equals("y")) {
				System.out.println("Enter number");
				int num = Integer.parseInt(sc.nextLine());
				if(mlist.size()==10) {
					mlist.remove(0);
				}
				mlist.add(new missedCall(num));
			}
			else {
				break;
			}
		}
	}
	
	public void viewLog() {
		for(int i=0;i<mlist.size();) {
			System.out.println("Enter option for call "+(i+1)+" :\n1.Delete this missedcall\n2.Next\n3.Display this missedcall\n4.exit");
			int n = Integer.parseInt(sc.nextLine());
			if(n==2) {
				i++;
			}
			else if(n==1) {
				mlist.remove(mlist.get(i));
			}else if(n==3){
				System.out.println(mlist.get(i));
				System.out.println();
			}
			else {
				break;
			}
		}
	}
}
