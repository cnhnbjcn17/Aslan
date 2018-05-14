package com.mybatis.demo.dao;

import java.util.List;

import com.mybatis.demo.entities.Key;
import com.mybatis.demo.entities.Lock;

public interface KeyMapper {
	public Lock getLockByKeyId(int i);
	public Key getKeyByKeyId(int i);
	//public Lock getLockByLockId(int i);
	public List<Lock> getAll();	
	public void getLockByLockId();
}
