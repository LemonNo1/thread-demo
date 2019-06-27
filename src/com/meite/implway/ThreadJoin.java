package com.meite.implway;

/**
 * join:让join的线程先执行完毕
 * 可以设置线程的执行顺序
 * @author LIMENG
 *
 */
public class ThreadJoin {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i <30; i++) {
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("t1子线程：i："+i);
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(300);
					t1.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for (int i = 0; i <30; i++) {
					System.out.println("t2子线程：i："+i);
				}
			}
		});
		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(300);
					t2.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for (int i = 0; i <30; i++) {
					System.out.println("t3子线程：i："+i);
				}
			}
		});
		t1.start();
		t2.start();
		t3.start();
	}
}
