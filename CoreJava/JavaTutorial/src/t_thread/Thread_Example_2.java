package t_thread;

class Thread10 extends Thread
{
	public void run() {
		for(int i = 0; i<5; i++)
		{
			System.out.println("Printing From thread 10 : " + i);
		}
	}
}

class Thread11 extends Thread
{
	public void run() {
		for(int i = 0; i<5; i++)
		{
			System.out.println("Printing From thread 11 : " + i);
		}
	}
}

public class Thread_Example_2 {

	public static void main(String[] args) throws InterruptedException 
	{
		Thread10 t10 = new Thread10();
		Thread11 t11 = new Thread11();
		
		t10.start();
		
		t10.join();
		
		t11.start();
	}

}
