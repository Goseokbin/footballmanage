package com.football.ex.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.football.ex.dao.matchDao;
import com.football.ex.dto.matchDto;
import com.football.ex.form.matchForm;
import com.football.ex.service.matchService;

@Controller

public class matchController {
	@Autowired 
	private matchService matchService;
	@Autowired
	private matchDao matchDao;
	
	@RequestMapping(value ="/info", method = RequestMethod.GET)
	public String map(matchForm matchForm) throws Exception {

		return "map";
		
	}
	@RequestMapping(value = "/getMatchList")
	@ResponseBody
	public List<matchDto> matchList(HttpServletRequest request, HttpServletResponse response, matchForm matchForm) throws Exception {
		
		List<matchDto> result = matchService.getMatchList(matchForm);
		for(matchDto i:result) {
			System.out.println(i.getTime());
		}
		
		return result;
	}
	
	

}
