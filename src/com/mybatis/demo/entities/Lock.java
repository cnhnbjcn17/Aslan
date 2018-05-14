package com.mybatis.demo.entities;


public class Lock  {
	int id;
	String lockName;
	Key key;
	@Override
	public String toString() {
		return "Lock [id=" + id + ", lockName=" + lockName + ", key=" + key
				+ "]";
	}
	public Lock(int id, String lockName, Key key) {
		super();
		this.id = id;
		this.lockName = lockName;
		this.key = key;
	}
	public Lock() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLockName() {
		return lockName;
	}
	public void setLockName(String lockName) {
		this.lockName = lockName;
	}
	public Key getKey() {
		return key;
	}
	public void setKey(Key key) {
		this.key = key;
	}

}
