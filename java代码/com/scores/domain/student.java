package com.scores.domain;

public class student {

	private String userid;
	
	private String username;
	private String password;
	private String tx;
	private Boolean is_teacher;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTx() {
		return tx;
	}
	public void setTx(String tx) {
		this.tx = tx;
	}
	public Boolean getIs_teacher() {
		return is_teacher;
	}
	public void setIs_teacher(Boolean is_teacher) {
		this.is_teacher = is_teacher;
	}
	
	
}
