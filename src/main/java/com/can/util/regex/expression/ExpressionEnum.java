package com.can.util.regex.expression;

/**
 * @description: 正则表达式
 *
 * @author: LCN
 * @date: 2018-07-03 15:45
 */
public enum  ExpressionEnum {

	/** 邮箱正则 */
	EMAIL("eMail", "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$"),

	/** 时间格式 yyyy-MM */
	MONTHWITHLINE("month", "^\\d{4}-\\d{1,2}$"),

	/** 时间格式 yyyy-MM-dd  */
	DAYWITHLINE("day", "^\\d{4}-\\d{1,2}-\\d{1,2}$"),

	/** 时间格式 yyyy-MM-dd hh:mm */
	MINUTEWITHLINE("minute", "^\\d{4}-\\d{1,2}-\\d{1,2}\\s\\d{1,2}:\\d{1,2}$"),

	/** 时间格式 yyyy-MM-dd hh:mm:ss */
	MILLISECONDwithline("millisecond", "^\\d{4}-\\d{1,2}-\\d{1,2}\\s\\d{1,2}:\\d{1,2}:\\d{1,2}$")
	;

	/** 正则表达式的名字*/
	private String regexName;
	/** 正则表达式 */
	private String regexExpression;

	ExpressionEnum (String regexName, String regexExpression) {
		this.regexName = regexName;
		this.regexExpression = regexExpression;
	}

	public String getRegexName() {
		return regexName;
	}

	public void setRegexName(String regexName) {
		this.regexName = regexName;
	}

	public String getRegexExpression() {
		return regexExpression;
	}

	public void setRegexExpression(String regexExpression) {
		this.regexExpression = regexExpression;
	}

}
