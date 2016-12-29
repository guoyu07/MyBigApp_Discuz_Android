package com.youzu.taobao.base.json;

import java.io.Serializable;
import java.util.ArrayList;

import com.youzu.taobao.base.json.mythread2.MyThread;

public class MyThreadJson implements Serializable {
	
	private static final long serialVersionUID = 6902330751014601306L;
	private String avatar;
	private ArrayList<MyThread> data;
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public ArrayList<MyThread> getData() {
		return data;
	}
	public void setData(ArrayList<MyThread> data) {
		this.data = data;
	}
	
	
}