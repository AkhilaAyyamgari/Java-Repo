import java.util.TreeSet;
public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet treeSet = new TreeSet();
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