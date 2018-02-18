package arrangement;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dao.LogMapper;
import com.pojo.Log;

@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class InsertLog {

	public static final Logger LOGGER = LogManager.getLogger(InsertLog.class);
	
	@Autowired
	private LogMapper logMapper;
	
	@Test
	public void test1() {
		Log log = new Log();
		log.setLoginName("admin");
		log.setOperatemessage("登录");
		log.setOperatedate(new Date());
		
		int result = logMapper.insertSelective(log);
		LOGGER.info("result = " + result);
	}
}
