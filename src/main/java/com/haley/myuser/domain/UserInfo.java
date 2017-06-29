package com.haley.myuser.domain;


// DTO Ŭ���� (Data Transfer Object) : �����ͺ��̽��� �����͸� ǥ���ϱ� ���� ��ü
public class UserInfo {

	// 1. ���� ����
	private int code;
	private String id;
	private String pw;
	
	// 2. get, set �Լ�
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
