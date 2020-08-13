package org;

class Thread1 extends Thread
{
	public void show()
	{
		for(int i = 0; i<5; i++)
		{
			try
			{
				sleep(3000);
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("Printing From thread 1 : " + i);
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

public class MyThread extends Thread {

	public static void main(String[] args) {
		
//		 Mother Thread
		Thread t = Thread.currentThread();
		
//		Child Thread
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		Thread4 t4 = new Thread4();
		
//		System.out.println("Before : " + t1.getPriority());
		t1.setPriority(10);
//		System.out.println("Now : "+ t1.getPriority());
//		t2.setPriority(7);
//		t3.setPriority(4);
//		t4.setPriority(10);
		
		t1.start();
		t2.start();
		t3.start();
		System.out.println(t3.isAlive());
		t4.start();
		

	}

}



/*
 * Thread join
 * Joining Threads in Java. java. ... 
 * Thread class provides the join() method 
 * which allows one thread to wait until another thread completes its execution. 
 * If a Thread object whose thread is currently executing, then t. join() 
 * will make sure that t is terminated before the next instruction is executed by the program.
 * 
 * In normal circumstances we generally have more than one thread, thread scheduler 
 * schedules the threads, which does not guarantee the order of execution of threads.
 * 
 * https://www.baeldung.com/java-stack-heap
 */






