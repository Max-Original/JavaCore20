package javacore20;

public class Application {

	public static void main(String[] args) {
		MyThread myThread = new MyThread("First", 1000);
		myThread.start();
		
		try {
			myThread.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("");
		RunnableThread myRun = new RunnableThread("Run", 1000);
		
	}

}
