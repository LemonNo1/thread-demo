package com.meite.implway.volatiles;

class VolatileThreadDemo implements Runnable{
	boolean flag = true;
	
	@Override
	public void run() {
		System.out.println("�߳̿�ʼ....");
		while (flag) {
			
		}
		System.out.println("�߳̽�����������");
		
	}
	
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
}


public class VolatileThread {
	
	public static void main(String[] args) throws InterruptedException {
		VolatileThreadDemo demo = new VolatileThreadDemo();
		Thread thread = new Thread(demo);
		thread.start();
		demo.setFlag(false);
		System.out.println("falg�޸�Ϊflase");
	}

}
