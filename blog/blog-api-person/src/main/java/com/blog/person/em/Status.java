package com.blog.person.em;

/**
 * 账号状态 （-1 删除 0 未激活 1 正常 2 锁定）
 */
public enum Status {
	DELETE(-1),INACTIVE(0),NORMAL(1),LOCK(2);
	
	private Integer value;

	private Status(Integer value) {
		this.value = value;
	}
	
	public Integer getValue() {
		return value;
	}
}
