package com.meite.implway;
/**
 * �����ڲ���
 * �������ýӿ���ʽ�����̣߳��ӿڿ���ʵ�ֶ����ֻ�ܵ��̳�
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
				System.out.println("�����ڲ���add����");
			}
		};
		parent.add();
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 30; i++) {
					System.out.println("1���̣߳�"+i);
				}
			}
		});
		t1.start();
		for (int i = 0; i < 30; i++) {
			System.out.println("2���̣߳�"+i);
		}
	}
	
}
