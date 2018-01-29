package arrangement;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pojo.PersonUser;
import com.service.impl.PersonUserServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class TestMyBatis {

	public static final Logger LOGGER = LogManager.getLogger(TestMyBatis.class);

	@Resource
	private PersonUserServiceImpl personUserServiceImpl;

	@Test
	public void test1() {
		PersonUser user = personUserServiceImpl.getPersonUserByUserId(1);
		LOGGER.info(user);
		PersonUser user2 = personUserServiceImpl.getPersonUserByUserId(1);
		LOGGER.info(user2);

	}
}