package com.meite.implway;

/**
 * 线程常用api
 * 
 * @author LIMENG
 *
 */
class ThreadCreateDemo05 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("id:" + getId() + "run:子线程" + ",name:" + Thread.currentThread().getName());
		}
	}

}

class ThreadCreateDemo04 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("id:" + Thread.currentThread().getId() + "run:子线程" + ",name:" + Thread.currentThread().getName());
		}
	}

}

public class ThreadDemo04 {

	public static void main(String[] args) {
		System.out.println("12主线程,name：" + Thread.currentThread().getName() + ",id:" + Thread.currentThread().getId());
		Thread thread = new Thread(new ThreadCreateDemo04());
		thread.start();
		ThreadCreateDemo05 demo05 = new ThreadCreateDemo05();
		demo05.start();
		for (int i = 0; i < 30; i++) {
			System.out
					.println("主线程,name：" + Thread.currentThread().getName() + ",id:" + Thread.currentThread().getId());
		}
	}
}
