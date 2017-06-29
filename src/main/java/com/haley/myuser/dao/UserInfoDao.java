package com.haley.myuser.dao;

import java.util.List;

import com.haley.myuser.domain.UserInfo;

// DAO Ŭ���� (Data Access Object) : �����ͺ��̽��� ������ ���� ��ü

public interface UserInfoDao {

	// CRUD ����

	// 1. create - ������ �Է� -> insert
	public int insert(UserInfo userInfo);

	// 2. Read - ������ ��ȸ
	// 2-1. selectAll() - ���̺� �� ��� ������ ��ȸ
	public List<UserInfo> selectAll();

	// 2-2. selectOne() - �⺻Ű(id)�� �������� ������ ��ȸ
	public UserInfo selectOne(String id);

	// 3. Update - �����ͺ��̽� ����
	public int update(UserInfo userInfo);

	// 4. Delete - ������ ����
	public int delete(String id);

}
