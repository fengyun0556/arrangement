package com.log;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 自动化装配Spring AOP
 * @author yangzf
 * @since 2018年2月1日 下午11:58:08
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class LogConfig {

}
