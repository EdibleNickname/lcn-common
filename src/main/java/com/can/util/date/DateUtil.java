package com.can.util.date;

import org.apache.commons.lang3.StringUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @description: 时间工具
 * @author: LCN
 * @date: 2018-07-21 16:50
 */
public class DateUtil {

	/** 时区 */
	private final static ZoneId ZONE;

	/** yyyy-MM */
	private final static int DATE_SHORT_LEN = 7;

	/** yyyy-MM-dd */
	private static int DATE_MIDDLE_LEN = 10;

	/** yyyy-MM-dd HH:mm:ss */
	public static int DATE_FULL_LEN = 19;

	static {
		ZONE = ZoneId.systemDefault();
	}

	public DateUtil(){
	}


	/**
	 * 获取当前的时间,包含时分秒
	 * @return
	 */
	public static Date getCurrentDateTime(){
		LocalDateTime localDateTime = LocalDateTime.now();
		return localDateTimeToDate(localDateTime);
	}

	/**
	 * 日期转字符串
	 * @param date
	 * @param formatter
	 * @return
	 */
	public static String dateToString(Date date, String formatter) {
		if (date == null) {
			return null;
		}

		if(formatter == null) {
			return null;
		}

		Instant instant = date.toInstant();
		LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZONE);
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(formatter);

		return dateTimeFormatter.format(localDateTime);

	}

	/**
	 * 字符串转日期
	 * @param dateStr
	 * @return
	 */
	public static Date stringToDate(String dateStr){

		System.out.println(dateStr);

		if (StringUtils.isEmpty(dateStr)) {
			return null;
		}

		// 时间字符串为 yyyy-MM
		if(dateStr.length() == DATE_SHORT_LEN) {
			return stringToDate(dateStr, TimeFormatterEnum.MONTHWITHLINE.getFormatter());
		}

		// 时间字符串为 yyyy-MM-dd
		if(dateStr.length() == DATE_MIDDLE_LEN) {
			return stringToDate(dateStr, TimeFormatterEnum.DAYWITHLINE.getFormatter());
		}

		// 时间字符串为 yyyy-MM-dd HH:mm:ss
		if(dateStr.length() == DATE_FULL_LEN) {
			return stringToDate(dateStr, TimeFormatterEnum.SECONDS.getFormatter());
		}

		return null;
	}

	/**
	 * 将时间转为指定格式的字符串
	 *
	 * @param dateStr
	 * @param format
	 * @return
	 */
	public static Date stringToDate(String dateStr, String format) {
		if (StringUtils.isEmpty(dateStr)) {
			return null;
		}

		if (StringUtils.isEmpty(format)) {
			return null;
		}

		Date date = null;

		try {
			DateFormat dateFormat = new SimpleDateFormat(format);
			date = dateFormat.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return date;

	}


	/**
	 * LocalDateTime转为Date
	 * @param localDateTimeToDate
	 * @return
	 */
	public static Date localDateTimeToDate(LocalDateTime localDateTimeToDate) {
		Instant instant = localDateTimeToDate.atZone(ZONE).toInstant();
		return  Date.from(instant);
	}


}
