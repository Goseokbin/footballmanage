package com.football.ex.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.football.ex.dto.BoardDto;
import com.football.ex.form.BoardForm;
import com.football.ex.service.BoardService;

@Controller
@RequestMapping(value = "/board")
public class BoardController {
	@Autowired
	private BoardService boardService;

	/** �Խ��� - ��� ������ �̵� */
	@RequestMapping(value = "/boardList")
	public String boardList(HttpServletRequest request, HttpServletResponse response) throws Exception {

		return "board/boardList";
	}

	/** �Խ��� - ��� ��ȸ */
	@RequestMapping(value = "/getBoardList")
	@ResponseBody
	public List<BoardDto> getBoardList(HttpServletRequest request, HttpServletResponse response, BoardForm boardForm)
			throws Exception {
		System.out.println("boardList");
		List<BoardDto> boardDtoList = boardService.getBoardList(boardForm);

		return boardDtoList;
	}

	/** �Խ��� - �� ������ �̵� */
	@RequestMapping(value = "/boardDetail")
	public String boardDetail(HttpServletRequest request, HttpServletResponse response) throws Exception {

		return "board/boardDetail";
	}

	/** �Խ��� - �� ��ȸ */
	@RequestMapping(value = "/getBoardDetail")
	@ResponseBody
	public BoardDto getBoardDetail(HttpServletRequest request, HttpServletResponse response, BoardForm boardForm)
			throws Exception {

		BoardDto boardDto = boardService.getBoardDetail(boardForm);

		return boardDto;
	}

	/** �Խ��� - �ۼ� ������ �̵� */
	@RequestMapping(value = "/boardWrite")
	public String boardWrite(HttpServletRequest request, HttpServletResponse response) throws Exception {

		return "board/boardWrite";
	}

	/** �Խ��� - ��� */
	@RequestMapping(value = "/insertBoard")
	@ResponseBody
	public BoardDto insertBoard(HttpServletRequest request, HttpServletResponse response, BoardForm boardForm)
			throws Exception {

		BoardDto boardDto = boardService.insertBoard(boardForm);

		return boardDto;
	}

	/** �Խ��� - ���� */
	@RequestMapping(value = "/deleteBoard")
	@ResponseBody
	public BoardDto deleteBoard(HttpServletRequest request, HttpServletResponse response, BoardForm boardForm)
			throws Exception {

		BoardDto boardDto = boardService.deleteBoard(boardForm);

		return boardDto;
	}

	/** �Խ��� - ���� ������ �̵� */
	@RequestMapping(value = "/boardUpdate")
	public String boardUpdate(HttpServletRequest request, HttpServletResponse response) throws Exception {

		return "board/boardUpdate";
	}

	/** �Խ��� - ���� */
	@RequestMapping(value = "/updateBoard")
	@ResponseBody
	public BoardDto updateBoard(HttpServletRequest request, HttpServletResponse response, BoardForm boardForm)
			throws Exception {

		BoardDto boardDto = boardService.updateBoard(boardForm);

		return boardDto;
	}

}
