package arrangement;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dto.person.RegisterInitDTO;
import com.log.PersonLog;
import com.pojo.PersonUser;
import com.service.PersonUserService;
import com.service.impl.PersonUserServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml","classpath:springmvc-config.xml" })
public class TestMyBatis {

	public static final Logger LOGGER = LogManager.getLogger(TestMyBatis.class);

	@Resource
	private PersonUserServiceImpl personUserServiceImpl;
	
	@Resource
	private PersonUserService personUserService;
	
	@Resource
	private PersonLog personLog;
	
	@Test
	public void test1() {
		PersonUser user = personUserServiceImpl.getPersonUserByUserId("admin");
		LOGGER.info(user);
		PersonUser user2 = personUserServiceImpl.getPersonUserByUserId("admin");
		LOGGER.info(user2);
	}
	
	@Test
	public void test2() {
		PersonUser user = personUserServiceImpl.getPersonUserByUserId("admin");
		LOGGER.info(user);
	}
	
	@Test
	public void test3() {
		PersonUser user = new PersonUser();
		user.setLoginName("test");
		user.setUserPassword("test");
		LOGGER.info(personUserService.insertUser(user));
	}
	
	@Test
	public void test4() {
		try {
			RegisterInitDTO registerInitDTO = new RegisterInitDTO();
			registerInitDTO.setLoginName("admin");
			personLog.loginSuccess(registerInitDTO, null, null);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
	
	
	
}