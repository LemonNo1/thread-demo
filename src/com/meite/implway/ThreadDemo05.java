package com.meite.implway;

/**
 * 守护线程
 * @author LIMENG
 *
 */
public class ThreadDemo05 {
	
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 30; i++) {
					System.out.println("子线程：i："+i);
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
				}
			}
		});
		//设置线程为守护线程
		thread.setDaemon(true); 
		thread.start();
		for (int i = 0; i < 30; i++) {
			System.out.println("main:"+i);
		}
		System.out.println("主线程执行完毕");
	}
}
