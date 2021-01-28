package t_thread;

class Thread1 extends Thread
{
	public void show()
	{
		for(int i = 0; i<5; i++)
		{
			System.out.println("Printing From thread 1 : " + i);
			try
			{
				sleep(3000);
			}
			catch (Exception e) 
			{
				System.out.println(e);
			}
		}
	}
	public void run() 
	{
		this.show();
	}
}


class Thread2 extends Thread
{
	public void run() {
		for(int i = 0; i<5; i++)
		{
			System.out.println("Printing From thread 2 : " + i);
		}
	}
}

class Thread3 extends Thread
{
	public void run() {
		for(int i = 0; i<5; i++)
		{
			System.out.println("Printing From thread 3 : " + i);
		}
	}
}


class Thread4 extends Thread
{
	public void run() {
		for(int i = 0; i<5; i++)
		{
			System.out.println("Printing From thread 4 : " + i);
		}
	}
}


public class My_Thread_Example 
{
	public static void main(String[] args) 
	{
		// Mother Thread
		// Thread t = Thread.currentThread();
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		Thread4 t4 = new Thread4();
		
		t4.setPriority(10);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		System.out.println(t3.isAlive());
		
	}
}
