package com.meite.implway.threadbatchinfo.exmple;

import java.util.List;

import com.meite.implway.threadbatchinfo.entity.UserEntity;


public class SendMsg implements Runnable{
	
	private List<UserEntity> list;
	
	public SendMsg(List<UserEntity> list) {
		this.list = list;
	}

	@Override
	public void run() {
		for (UserEntity userEntity : list) {
			System.out.println("threadName:"+Thread.currentThread().getName()+";"+userEntity.toString());
		}
		System.out.println();
	}
	
}
