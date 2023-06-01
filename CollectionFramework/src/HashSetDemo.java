import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Object> hs = new HashSet<Object>();
		
		hs.add(100);
		hs.add(200);
		hs.add("hi");
		hs.add("hello");
		hs.add("hi");
		hs.add(200);
		hs.add(300);
		
//		System.out.println(hs.size());
//		System.out.println(hs);
//		System.out.println(hs.contains("hi"));
//		System.out.println(hs.remove("hi"));
		
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
