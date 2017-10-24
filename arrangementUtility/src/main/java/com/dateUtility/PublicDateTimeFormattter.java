package com.dateUtility;

import java.time.format.DateTimeFormatter;

public interface PublicDateTimeFormattter {

	/** yyyy-MM-dd HH:mm:ss SSS */
	DateTimeFormatter INTERNAL_DATETIME_DETAIL_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss SSS");

	/** yyyy-MM-dd HH:mm:ss */
	DateTimeFormatter INTERNAL_DATETIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	
	/** yyyy-MM-dd */
	DateTimeFormatter INTERNAL_DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
	/** HH:mm:ss */
	DateTimeFormatter INTERNAL_TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss");
	
	/** yyyy年MM月dd日 HH时mm分ss秒 SSS毫秒 */
	DateTimeFormatter CHINESE_DATETIME_DETAIL_FORMATTER = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒 SSS毫秒");
	
	/** yyyy年MM月dd日 HH时mm分ss秒 */
	DateTimeFormatter CHINESE_DATETIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒");
	
	/** yyyy年MM月dd日 */
	DateTimeFormatter CHINESE_DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
	
	/** HH时mm分ss秒 */
	DateTimeFormatter CHINESE_TIME_FORMATTER = DateTimeFormatter.ofPattern("HH时mm分ss秒");
}
