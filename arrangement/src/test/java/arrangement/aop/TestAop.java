package arrangement.aop;

import javax.annotation.Resource;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.controller.person.LoginController;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:springmvc-config.xml","classpath:spring-mybatis.xml"})
public class TestAop {

	@Resource
	private LoginController loginController;
	
}
