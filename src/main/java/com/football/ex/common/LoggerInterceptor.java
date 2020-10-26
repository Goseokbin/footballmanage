package com.football.ex.common;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoggerInterceptor extends HandlerInterceptorAdapter {
	@SuppressWarnings("rawtypes")
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("==================== LoggerInterceptor START====================");
		/*
		// Test용이므로 임시 삭제
		System.out.printf(" URI [%]\n", request.getRequestURI());

		Enumeration paramNames = request.getParameterNames();
		
		while (paramNames.hasMoreElements()) {
			String key = (String) paramNames.nextElement();
			String value = request.getParameter(key);

			System.out.println(" RequestParameter Data ==>  " + key + " : " + value + "");
		}
		*/
		return super.preHandle(request, response, handler);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("==================== LoggerInterceptor END ====================");
	}

}
