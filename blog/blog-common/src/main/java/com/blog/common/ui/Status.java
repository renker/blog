package com.blog.common.ui;

/**
 * 
 * @see JsonResult
 *
 */
public enum Status {
		SUCCESS("success"),ERROR("error"),WARN("warn"),UNAUTHORIZED("unauthorized");
	
	private String value;
	
	public String getValue() {
		return value;
	}

	private Status(String value) {
		this.value = value;
	}
}
