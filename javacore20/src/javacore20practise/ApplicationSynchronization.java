package javacore20practise;

public class ApplicationSynchronization {
	static int number = 0;

	public static void main(String[] args) throws InterruptedException {
		Thread myThread = new Thread(new Worker());
		myThread.start();
		
		Thread myThread2 = new Thread(new Worker());
		myThread2.start();
		
		Thread myThread3 = new Thread(new Worker());
		myThread3.start();
		
		Thread myThread4 = new Thread(new Worker());
		myThread4.start();
		
		Thread myThread5 = new Thread(new Worker());
		myThread5.start();
		
		myThread.join();
		myThread2.join();
		myThread3.join();
		myThread4.join();
		myThread5.join();
		
		System.out.println(number);
	}
	//if this method did not have synchronized, value of number will not be 10 k some times, because it works slower;
	static synchronized void incrementNumber() {
		number++;
	}

}
class Worker implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 2000; i++) {
			ApplicationSynchronization.incrementNumber();
		}
	}

}

