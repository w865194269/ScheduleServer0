package com.schedule.beans.json;

import java.util.ArrayList;
import java.util.List;

public class JsonList {

	private int code=1;//返回结果码，1表示成功，-1表示失败，此时需要完善msg提示
	private String msg;
	
	private List<SResult> result=null;

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

	public List<SResult> getResult() {
		if (this.result==null) {
			result=new ArrayList<SResult>();
		}
		return result;
	}

	public void setResult(List<SResult> list) {
		this.result = list;
	}
	
}
