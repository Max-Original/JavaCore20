package javacore20practise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ApplicationExecutor {

	public static void main(String[] args) {
		
		ExecutorService executable = Executors.newFixedThreadPool(200);
		
		executable.execute(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Asysnchmoniys task hello world");
			}
		});
		//if we wont use shutdown than it will continue creating new Threads until the end;
		executable.shutdown();
	}

}
