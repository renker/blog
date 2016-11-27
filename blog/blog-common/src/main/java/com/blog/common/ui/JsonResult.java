package com.blog.common.ui;

import java.io.Serializable;
/**
 * 
 * @author renker
 * @date 2016年11月27日 下午2:35:03
 */
public class JsonResult implements Serializable{
	private static final long serialVersionUID = 565961431082942325L;
	/**
	 * 状态 
	 * @see Status
	 */
	private String status;
	/**
	 * 消息
	 */
	private String msg;
	/**
	 * 结果
	 */
	private Object result;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getResult() {
		return result;
	}
	public void setResult(Object result) {
		this.result = result;
	}
	public JsonResult() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JsonResult(String status, String msg, Object result) {
		super();
		this.status = status;
		this.msg = msg;
		this.result = result;
	}
	public JsonResult(String status) {
		super();
		this.status = status;
	}
	public JsonResult(String status, Object result) {
		super();
		this.status = status;
		this.result = result;
	}
	
	
}
