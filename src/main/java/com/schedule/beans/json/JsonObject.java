package com.schedule.beans.json;

public class JsonObject {

	private int code=1;//返回结果码，1表示成功，-1表示失败，此时需要完善msg提示
	private String msg="成功";
	
	private SYJResult result;

	/**
	 * 当发生异常时执行
	 * @param code
	 * @param msg
	 */
	public JsonObject(int code,String msg) {
		this.code=code;
		this.msg=msg;
	}
	/**
	 * 执行成功时使用
	 * @param result
	 */
	public JsonObject(SYJResult result){
		if (result!=null) {
			this.result=result;
		}else{
			this.code=-1;
			this.msg="当前获取的信息不存在";
		}
	}
	public int getCode() {
		return code;
	}

	public JsonObject setCode(int code) {
		this.code = code;
		return this;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public SYJResult getResult() {
		return result;
	}

	public JsonObject setResult(SYJResult result) {
		this.result = result;
		return this;
	}

	
}