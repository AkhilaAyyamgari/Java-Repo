
public class BasicThreadDemo {

	public static void main(String[] args) {
		Thread obj = Thread.currentThread();
		System.out.println(obj.getName());
		System.out.println(obj.getPriority());
		System.out.println(obj.getState());
		System.out.println(obj.getThreadGroup());

	}

}
