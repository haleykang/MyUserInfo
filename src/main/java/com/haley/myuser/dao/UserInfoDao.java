package com.haley.myuser.dao;

import java.util.List;

import com.haley.myuser.domain.UserInfo;

// DAO 클래스 (Data Access Object) : 데이터베이스와 연동을 위한 객체

public interface UserInfoDao {

	// CRUD 구현

	// 1. create - 데이터 입력 -> insert
	public int insert(UserInfo userInfo);

	// 2. Read - 데이터 조회
	// 2-1. selectAll() - 테이블 내 모든 데이터 조회
	public List<UserInfo> selectAll();

	// 2-2. selectOne() - 기본키(id)를 기준으로 데이터 조회
	public UserInfo selectOne(String id);

	// 3. Update - 데이터베이스 수정
	public int update(UserInfo userInfo);

	// 4. Delete - 데이터 삭제
	public int delete(String id);

}
