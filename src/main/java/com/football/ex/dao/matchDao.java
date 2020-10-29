package com.football.ex.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.football.ex.dto.matchDto;
import com.football.ex.form.matchForm;

@Repository
public class matchDao {
	@Resource(name = "sqlSession")
	private SqlSession sqlSession;

	private static final String NAMESPACE = "com.football.ex.matchMapper";

	public List<matchDto> getMatchList(matchForm matchForm) throws Exception {
		List<matchDto> result =sqlSession.selectList(NAMESPACE + ".getMatchList", matchForm);
		for(matchDto dto : result) {
			System.out.println(dto.getTeam());
		}
			return sqlSession.selectList(NAMESPACE + ".getMatchList", matchForm);
	}

}
