package com.haley.myuser.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.haley.myuser.domain.UserInfo;

// Impl Ŭ���� - UserInfoDao�� implements�ϴ� Ŭ����
// -> �Լ� ���� ����

//1. @Repository : �� Ŭ������ ��ü�� �ڵ����� ����
//�� Ŭ������ �����ͺ��̽� �����ϴ� Ŭ������� �˷��ִ� �뵵
@Repository
public class UserInfoDaoImpl implements UserInfoDao {

	// 2. @Autowired : ������ �ڷ������� ������� ��ü�� ������ �ڵ����� ����
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int insert(UserInfo userInfo) {
		/*
		 * <insert id="insert" parameterType="com.haley.myuser.domain.UserInfo">
		 * insert into userinfo values(code=#{code},id=#{id},pw=#{pw}) </insert>
		 */
		return sqlSession.insert("UserInfo.insert", userInfo);
	}

	@Override
	public List<UserInfo> selectAll() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("UserInfo.selectAll");
	}

	@Override
	public UserInfo selectOne(String id) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("UserInfo.selectOne", id);
	}

	@Override
	public int update(UserInfo userInfo) {
		/*
		 * <update id="update" parameterType="com.haley.myuser.domain.UserInfo">
		 * update userinfo set pw=#{pw} where id=#{id} </update>
		 */
		return sqlSession.update("UserInfo.update", userInfo);
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return sqlSession.delete("UserInfo.delete", id);
	}

}
