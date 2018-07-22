package com.can.util.date;

/**
 * @description:
 * @author: LCN
 * @date: 2018-07-21 22:42
 */
public enum TimeFormatterEnum {

	SECONDS("millisecond", "yyyy-MM-dd HH:mm:ss"),
	MINUTE("minute", "yyyy-MM-dd HH:mm"),
	DAYWITHLINE("day", "yyyy-MM-dd"),
	DAYWITHOUTLINE("day", "yyyyMMdd"),
	MONTHWITHLINE("month", "yyyy-MM"),
	MONTHWITHOUTLINE("month", "yyyMM"),
	TIME("time", "HH:mm:ss")
	;

	/** 格式名*/
	private String formatterName;

	/** 格式*/
	private String formatter;

	TimeFormatterEnum(String formatterName, String formatter) {
		this.formatterName = formatterName;
		this.formatter = formatter;
	}

	public String getFormatterName() {
		return formatterName;
	}

	public void setFormatterName(String formatterName) {
		this.formatterName = formatterName;
	}

	public String getFormatter() {
		return formatter;
	}

	public void setFormatter(String formatter) {
		this.formatter = formatter;
	}
}
