package com.youzu.taobao.base.json.favforum;

import com.youzu.taobao.base.json.model.Variables;

public class AddFavForumVariables extends Variables{
	private static final long serialVersionUID = -4765381150075849265L;
	private String favid;
	public String getFavid() {
		return favid;
	}
	public void setFavid(String favid) {
		this.favid = favid;
	}
}
