package javacore20;

import java.util.Scanner;

public class MyThread extends Thread{
	
	private String name;
	private int delay;
	private Scanner scanner;
	
	
	public MyThread(String name, int delay) {
		this.name = name;
		this.delay = delay;
	}


	@Override
	public synchronized void run(){
		System.out.print("Enter a number:");
		scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		int n0 = 0;
		int n1 = 1;
		int n2;
		for (int i = 0; i <= value; i++) {
			n2=n0+n1;
			System.out.print(n2+" ");
			n0=n1;
			n1=n2;
		}

		try {
			Thread.sleep(delay);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

