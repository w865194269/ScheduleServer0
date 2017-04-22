package com.schedule.beans.json;

import java.util.ArrayList;
import java.util.List;

public class JsonList {

	private int code=1;//返回结果码，1表示成功，-1表示失败，此时需要完善msg提示
	private String msg;
	
	private List<SYJResult> result=null;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<SYJResult> getResult() {
		if (this.result==null) {
			result=new ArrayList<SYJResult>();
		}
		return result;
	}

	public void setResult(List<SYJResult> list) {
		this.result = list;
	}
	
}
