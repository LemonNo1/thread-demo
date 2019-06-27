package com.meite.implway.volatiles;

class VolatileThreadDemo implements Runnable{
	boolean flag = true;
	
	@Override
	public void run() {
		System.out.println("线程开始....");
		while (flag) {
			
		}
		System.out.println("线程结束。。。。");
		
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
		System.out.println("falg修改为flase");
	}

}
