package com.blog.common.ui;


public class BaseController {
	public JsonResult jsonResult(Status status){
		return new JsonResult(status.getValue());
	}
	
	public JsonResult jsonResult(Status status,String msg){
		return new JsonResult(status.getValue(), msg);
	}
	
	public JsonResult JsonResult(Status status,Object result){
		return new JsonResult(status.getValue(), result);
	}
	
	public JsonResult JsonResult(Status status,String msg,Object result){
		return new JsonResult(status.getValue(), msg, result);
	}
}
