package com.meite.implway;

/**
 * �ػ��߳�
 * @author LIMENG
 *
 */
public class ThreadDemo05 {
	
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 30; i++) {
					System.out.println("���̣߳�i��"+i);
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
				}
			}
		});
		//�����߳�Ϊ�ػ��߳�
		thread.setDaemon(true); 
		thread.start();
		for (int i = 0; i < 30; i++) {
			System.out.println("main:"+i);
		}
		System.out.println("���߳�ִ�����");
	}
}
