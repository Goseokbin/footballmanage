package com.football.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.football.ex.dao.matchDao;
import com.football.ex.dto.matchDto;
import com.football.ex.form.matchForm;

@Service
public class matchService {
	@Autowired
	private matchDao matchDao;
	
	public List<matchDto> getMatchList(matchForm matchForm) throws Exception{
		return matchDao.getMatchList(matchForm);
		
	}

}
