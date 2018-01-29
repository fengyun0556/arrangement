package com;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import com.classUtility.TransferField;
import com.pojo.PersonUser;

public class TransferClass {

	public static final Logger LOGGER = LogManager.getLogger(TransferClass.class);

	@Test
	public void transfer1() {
		try {

			LOGGER.info("start");
			PersonUser personUser = new PersonUser();
			personUser.setUserName("登录名");
			
			PersonUser newPersonUser = new PersonUser();
			Field[] fields = personUser.getClass().getDeclaredFields();
			Field[] newFields = newPersonUser.getClass().getDeclaredFields();
			
			AccessibleObject.setAccessible(fields, true);
			AccessibleObject.setAccessible(newFields, true);
			
			for (int i = 0; i < fields.length; i++) {
				
				Field field = fields[i];
				String propertyName = field.getName();
				for (int j = 0; j < newFields.length; j++) {
					
					Field newField = newFields[j];
					String newPropertyName = newField.getName();
					if(propertyName.equals(newPropertyName)) break;
					
				}
			}
			LOGGER.info("end");
			
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void transfer2() {
		TransferField transferField = TransferField.getTransferFieldInstance();
		PersonUser personUser = new PersonUser();
		personUser.setLoginName("admin");
		personUser.setUserName("管理员");
		personUser.setBirthday(new Date());
		PersonUser newPersonUser = new PersonUser();
		LOGGER.info(newPersonUser);

		LOGGER.info("start");
		transferField.transferFields(newPersonUser, personUser);
		LOGGER.info("end");
		
		
		LOGGER.info(newPersonUser);
		
		
	}
}
