class MyNumber implements Runnable{
@Override
	public void run() {
		try
		{
		for (int i=1;i<=10;i++)
		{
		System.out.println(i);
		}
	}catch(Exception e){
		System.out.println(e);
	}	
	}
}
public class DisplayNumber {
     public static void main(String[] args) {
		MyNumber mn1= new MyNumber();
		Thread t1= new Thread(mn1);
		t1.start();
       }
}
