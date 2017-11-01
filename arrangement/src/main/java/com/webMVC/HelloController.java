package com.webMVC;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller{

	private static final Logger logger = LogManager.getLogger(HelloController.class);
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		logger.info("handleRequest 被调用");
		//创建准备返回的ModelAndView对象，该对象通常包含了返回视图名、模型的名称以及模型对象
		ModelAndView mv = new ModelAndView();
		//添加模型数据，可以是任意的pojo对象
		mv.addObject("message", "hello world");
		//设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面
		mv.setViewName("/WEB-INF/content/welcome.jsp");
		return mv;
	}

}
