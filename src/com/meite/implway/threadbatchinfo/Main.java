package com.meite.implway.threadbatchinfo;

import java.util.ArrayList;
import java.util.List;

import com.meite.implway.threadbatchinfo.entity.UserEntity;
import com.meite.implway.threadbatchinfo.exmple.SendMsg;

public class Main {
	public static void main(String[] args) {
		List<UserEntity> initUser = initUser();
		//定义每个线程分配数据大小
		int countSize = 2;
		List<List<UserEntity>> splitList = ListUtils.splitList(initUser, countSize);
		for (int i = 0; i < splitList.size(); i++) {
			List<UserEntity> list = splitList.get(i);
			Thread thread = new Thread(new SendMsg(list),""+i);
			thread.start();
		}
	}
	
	public static List<UserEntity> initUser(){
		List<UserEntity> entities = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			UserEntity entity = new UserEntity("userId"+i, "userName"+i);
			entities.add(entity);
		}
		return entities;
	}
}
