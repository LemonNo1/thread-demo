package com.meite.implway.sychnorzied;

class TrainThread implements Runnable {
	static int count = 100;
	static Object obj = new Object();

	@Override
	public void run() {
		while (count > 0) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				start();
		}

	}

	public void start() {
		synchronized (obj) {
			if (count>0) {
				System.out.println(Thread.currentThread().getName() + ";第" + (100 - count + 1) + "张票");
				count--;
			}
		}
	}
}

public class TrainDemo {
	public static void main(String[] args) {
		TrainThread thread2 = new TrainThread();
		TrainThread thread1 = new TrainThread();
		Thread t1 = new Thread(thread1, "窗口1");
		Thread t2 = new Thread(thread2, "窗口2");
		t1.start();
		t2.start();
	}
}
