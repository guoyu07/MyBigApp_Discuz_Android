package com.youzu.taobao.base.json.threadview;

import com.youzu.android.framework.json.annotation.JSONField;
import com.youzu.taobao.base.json.BaseJson;

public class ThreadJson extends BaseJson {
	private ThreadVariables variables;

	public ThreadVariables getVariables() {
		return variables;
	}

	@JSONField(name="Variables")
	public void setVariables(ThreadVariables variables) {
		this.variables = variables;
	}
}
