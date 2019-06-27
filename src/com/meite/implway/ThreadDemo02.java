package com.meite.implway;
/**
 * 优先适用接口形式创建线程，接口可以实现多个，只能单继承
 * @author LIMENG
 *
 */
class ThreadCreateDemo02 implements Runnable{
	
	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.println("run:"+i);
		}
	}
	
}

public class ThreadDemo02 {
	
	public static void main(String[] args) {
		ThreadCreateDemo02 t2 = new ThreadCreateDemo02();
		Thread thread = new Thread(t2);
		thread.start();
		for (int i = 0; i < 30; i++) {
			System.out.println("main:"+i);
		}
	}
}
