import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {	  
	LinkedHashSet<Object> ls=new LinkedHashSet<Object>();  
	ls.add(100);
	ls.add(200);
	ls.add("hi");
	ls.add("hello");
	ls.add("hi");
	ls.add(100);
	ls.add(300);	
	System.out.println(ls);
	System.out.println(ls.size());
	}
}
/*
Doesn't allow duplicates
It provide insertion order
*/