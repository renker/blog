package com.blog.person.condition;

import com.blog.person.em.Status;

public class PersonCondition {
	private String account;
	private Integer status;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status.getValue();
	}
	
}
