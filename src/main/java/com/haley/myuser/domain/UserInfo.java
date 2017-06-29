package com.haley.myuser.domain;


// DTO 클래스 (Data Transfer Object) : 데이터베이스의 데이터를 표현하기 위한 객체
public class UserInfo {

	// 1. 변수 선언
	private int code;
	private String id;
	private String pw;
	
	// 2. get, set 함수
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	// 3. toString() 
	@Override
	public String toString() {
		return "UserInfo [code=" + code + ", id=" + id + ", pw=" + pw + "]\n";
	}
	
	

}
