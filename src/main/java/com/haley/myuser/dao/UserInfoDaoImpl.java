package com.haley.myuser.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.haley.myuser.domain.UserInfo;

// Impl 클래스 - UserInfoDao를 implements하는 클래스
// -> 함수 내용 구현

//1. @Repository : 이 클래스의 객체를 자동으로 생성
//이 클래스는 데이터베이스 접근하는 클래스라고 알려주는 용도
@Repository
public class UserInfoDaoImpl implements UserInfoDao {

	// 2. @Autowired : 동일한 자료형으로 만들어진 객체가 있으면 자동으로 연결
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
