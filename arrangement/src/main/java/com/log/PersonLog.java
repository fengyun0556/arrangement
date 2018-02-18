package com.log;

import java.util.Date;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;

import com.dao.LogMapper;
import com.dto.person.RegisterInitDTO;
import com.pojo.Log;

@Component
@Aspect
public class PersonLog {

	@Resource
	private LogMapper logMapper;
	
	private Log logPrototype = new Log();
	
	public static final Logger LOGGER = LogManager.getLogger(PersonLog.class);
	
	/**
	 * 登录的切点
	 * @author yangzf
	 * @since 2018年2月3日 下午6:57:29
	 */
	@Pointcut("execution(* com.controller.person.LoginController.login(..)) && args(registerInitDTO, errors, model)")
	public void loginPointcut(RegisterInitDTO registerInitDTO, Errors errors, Model model) {}
	
	/**
	 * 登录操作
	 * @author yangzf
	 * @since 2018年1月30日 下午9:59:50
	 */
	@Before("loginPointcut(registerInitDTO, errors, model)")
	public void loginSuccess(RegisterInitDTO registerInitDTO, Errors errors, Model model) throws CloneNotSupportedException {
		Log log = (Log) logPrototype.clone();
		log.setLoginName(registerInitDTO.getLoginName());
		log.setOperatedate(new Date());
		log.setOperatemessage("登录");
		logMapper.insertSelective(log);
	}
	
	/**
	 * 登录异常
	 * @author yangzf
	 * @since 2018年1月30日 下午10:00:11
	 */
	@AfterThrowing("loginPointcut(registerInitDTO, errors, model)")
	public void loginException(RegisterInitDTO registerInitDTO, Errors errors, Model model) throws CloneNotSupportedException {
		Log log = (Log) logPrototype.clone();
		log.setLoginName(registerInitDTO.getLoginName());
		log.setOperatedate(new Date());
		log.setOperatemessage("登录异常");
		logMapper.insertSelective(log);
	}
	
	
}
