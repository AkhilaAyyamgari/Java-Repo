import java.util.Comparator;
import java.util.TreeSet;
class customComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		int i=0;
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		if(i1<i2) {
			i=1;
		}if(i1>i2) {
			i=-1;
		}
		return i;
	}
	
}

public class CustomTreeSetDemo {

	public static void main(String[] args) {
		TreeSet treeSet = new TreeSet(new customComparator());
		treeSet.add(10);
		treeSet.add(20);
		treeSet.add(3);
		treeSet.add(9);
		treeSet.add(50);
		treeSet.add(20);
		treeSet.add(10);
//		treeSet.add("Hello");
		System.out.println(treeSet);

	}

}
