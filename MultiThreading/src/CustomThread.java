class MyThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
	}
	
}
public class CustomThread {

	public static void main(String[] args) {
		MyThread mt1= new MyThread();
		Thread t1 = new Thread(mt1);
		t1.start();
		t1.setName("MyFisrtThread");
	}

}
