package com.intercept;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.dto.person.RegisterInitDTO;
import com.pojo.PersonUser;

public class AuthorizationInterceptor implements HandlerInterceptor {

	public static final Logger LOGGER = LogManager.getLogger(AuthorizationInterceptor.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		LOGGER.info("preHandle");
		PersonUser personUser = (PersonUser) request.getSession().getAttribute("personUser");
		if(personUser == null) {
			request.setAttribute("registerInitDTO", new RegisterInitDTO());
			request.getRequestDispatcher("/person/loginForm").forward(request, response);
			return false;
		}else {
			return true;
		}
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		LOGGER.info("postHandle");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		LOGGER.info("afterCompletion");
	}
	
	

}
