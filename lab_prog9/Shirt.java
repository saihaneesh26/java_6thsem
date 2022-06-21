
package shirt;
import java.util.ArrayList;
public class Shirt {
	public static ArrayList<Shirt> list = new ArrayList<Shirt>();
	public String acc,tag,pocket,color;
	public Shirt(String acc,String tag,String pocket,String color) {
		this.acc = acc;
		this.tag = tag;
		this.color = color;
		this.pocket = pocket;
	}
}
