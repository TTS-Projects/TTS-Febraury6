package threads_and_streams;


import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

public class DeadlockExample {

    private  Lock lock1 = new ReentrantLock(true);
    private Lock lock2 = new ReentrantLock(true);

    public static void main(String[] args) {
        DeadlockExample deadlock = new DeadlockExample();
       
        
        
        new Thread(() -> {
			try {
				deadlock.operation1();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}, "T1").start();
        new Thread(() -> {
			try {
				deadlock.operation2();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}, "T2").start();
    }

    public void operation1() throws InterruptedException {
        
    	lock1.lock();
        System.out.println("lock1 acquired, waiting to acquire lock2.");
        Thread.sleep(50);


        lock1.unlock();
        
      lock2.lock();
      System.out.println("lock2 acquired");

      System.out.println("executing first operation.");

      lock2.unlock();
    }

    public void operation2() throws InterruptedException {
        lock2.lock();
        System.out.println("lock2 acquired, waiting to acquire lock1.");
        Thread.sleep(50);


        lock2.unlock();
        
	      lock1.lock();
	      System.out.println("lock1 acquired");
	
	      System.out.println("executing second operation.");
	
	      lock1.unlock();
    }

    // helper methods

}