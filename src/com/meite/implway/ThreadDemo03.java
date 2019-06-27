package com.meite.implway;
/**
 * 匿名内部类
 * 优先适用接口形式创建线程，接口可以实现多个，只能单继承
 * @author LIMENG
 *
 */
abstract class Parent{
	public abstract void add();
}

public class ThreadDemo03 {
	public static void main(String[] args) {
		Parent parent = new Parent() {
			@Override
			public void add() {
				System.out.println("匿名内部类add方法");
			}
		};
		parent.add();
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 30; i++) {
					System.out.println("1子线程："+i);
				}
			}
		});
		t1.start();
		for (int i = 0; i < 30; i++) {
			System.out.println("2主线程："+i);
		}
	}
	
}
