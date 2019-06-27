package com.meite.implway;

class ThreadCreateDemo01 extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.println("run:"+i);
		}
	}
	
}

public class ThreadDemo01 {
	
	public static void main(String[] args) {
		ThreadCreateDemo01 t1 = new ThreadCreateDemo01();
		//t1.start();
		t1.run();
		for (int i = 0; i < 30; i++) {
			System.out.println("main:"+i);
		}
	}
}
