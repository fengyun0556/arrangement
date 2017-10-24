package com.dateUtility;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PublicDate implements PublicDateTimeFormattter{

	/**
	 * @return date format : yyyy-MM-dd
	 * @2017年10月6日 @上午11:51:15
	 */
	public final static String getInternalCurrentDate() {
		LocalDate localDate = LocalDate.now();
		return localDate.format(INTERNAL_DATE_FORMATTER);
	}
	
	/**
	 * @return date format : yyyy年MM月dd日
	 * @2017年10月25日 @上午6:58:15
	 */
	public final static String getChineseCurrentDate() {
		LocalDate localDate = LocalDate.now();
		return localDate.format(CHINESE_DATE_FORMATTER);
	}
	
	/**
	 * @return time format : HH:mm:ss
	 * @2017年10月6日 @下午4:08:16
	 */
	public final static String getInternalCurrentTime() {
		LocalDateTime localDateTime = LocalDateTime.now();
		return localDateTime.format(INTERNAL_TIME_FORMATTER);
	}
	
	/**
	 * @return dateTime format : yyyy年MM月dd日 HH时mm分ss秒
	 * @2017年10月6日 @下午4:10:40
	 */
	public final static String getChineseCurrentDateTime() {
		LocalDateTime localDateTime = LocalDateTime.now();
		return localDateTime.format(CHINESE_DATETIME_FORMATTER);
	}
}
