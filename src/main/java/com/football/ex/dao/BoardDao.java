package com.football.ex.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.football.ex.dto.BoardDto;
import com.football.ex.form.BoardForm;

@Repository
public class BoardDao {

	@Resource(name = "sqlSession")
	private SqlSession sqlSession;

	private static final String NAMESPACE = "com.football.ex.boardMapper";

	/** �Խ��� - ��� ��ȸ */
	public List<BoardDto> getBoardList(BoardForm boardForm) throws Exception {
		List<BoardDto> result =sqlSession.selectList(NAMESPACE + ".getBoardList", boardForm);

		
			return sqlSession.selectList(NAMESPACE + ".getBoardList", boardForm);
	}

	/** �Խ��� - ��ȸ �� ���� */
	public int updateBoardHits(BoardForm boardForm) throws Exception {

		return sqlSession.update(NAMESPACE + ".updateBoardHits", boardForm);
	}

	/** �Խ��� - �� ��ȸ */
	public BoardDto getBoardDetail(BoardForm boardForm) throws Exception {

		return sqlSession.selectOne(NAMESPACE + ".getBoardDetail", boardForm);
	}

	/** �Խ��� - ��� */
	public int insertBoard(BoardForm boardForm) throws Exception {
		return sqlSession.insert(NAMESPACE + ".insertBoard", boardForm);
	}

	/** �Խ��� - ���� */
	public int deleteBoard(BoardForm boardForm) throws Exception {

		return sqlSession.delete(NAMESPACE + ".deleteBoard", boardForm);
	}

	/** �Խ��� - ���� */
	public int updateBoard(BoardForm boardForm) throws Exception {

		return sqlSession.update(NAMESPACE + ".updateBoard", boardForm);
	}
}
