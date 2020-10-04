package javacore20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RunnableThread implements Runnable{

	private String name;
	private int delay;
	private Scanner scanner;
	private Thread thread;
	
	public RunnableThread(String name, int delay) {
		this.name = name;
		this.delay = delay;
		this.thread = new Thread(this);
		thread.start();
	}
	
	@Override
	public synchronized void run() {
		System.out.println("Enter a number:");
		scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		int n0 = 0;
		int n1 = 1;
		int n2;
		List<Integer> array = new ArrayList();
		for (int i = 0; i <= value; i++) {
			n2=n0+n1;
			n0=n1;
			n1=n2;
			array.add(n2);
		}
		Object[] array2 = array.toArray();
		int arrayLength = array.size()-1;
		for (int i = arrayLength; i >= 0; i--) {
			int value2 = (int) array2[i];
			System.out.print(value2+" ");
		}
		
		try {
			Thread.sleep(delay);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
