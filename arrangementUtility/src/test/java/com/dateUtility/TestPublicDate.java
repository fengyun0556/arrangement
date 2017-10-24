package com.dateUtility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.Test;

public class TestPublicDate {

	@Test
	public void testGetCurrentdate() {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss SSS");
		LocalDateTime localDateTime = LocalDateTime.now();
		String dateString = localDateTime.format(dateTimeFormatter);
		System.out.println(dateString);
	}
	
	@Test
	public void testPublicDate() {
		System.out.println(PublicDate.getChineseCurrentDateTime());
		System.out.println(PublicDate.getInternalCurrentDate());
		System.out.println(PublicDate.getInternalCurrentTime());
	}
}
