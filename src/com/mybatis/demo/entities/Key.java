package com.mybatis.demo.entities;

public class Key {
	int id;
	String keyName;
	//Lock lock;

	@Override
	public String toString() {
		return "Key [id=" + id + ", keyName=" + keyName + ", lock=" + "]";
	}

	public Key(int id, String keyName, Lock lock) {
		super();
		this.id = id;
		this.keyName = keyName;
	}

	public Key() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKeyName() {
		return keyName;
	}

	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	

}
