package com.can.util.regex;


import com.can.util.regex.expression.ExpressionEnum;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @description:
 * @author: LCN
 * @date: 2018-07-03 15:42
 */
public class RegexUtil {

	private final static Logger log = LoggerFactory.getLogger(RegexUtil.class);

	/**
	 * 正则校验邮箱格式是否正确
	 *
	 * @param eMail
	 * @return
	 */
	public static boolean isEmail(String eMail) {

		if(StringUtils.isEmpty(eMail)) {
			log.info("需要验证的邮箱为空");
			return false;
		}

		// 开始验证
		return valid(ExpressionEnum.EMAIL.getRegexExpression(), eMail);
	}

	/**
	 * 验证时间格式是否符合指定的格式
	 *
	 * @param time
	 * @param format
	 * @return
	 */
	public static boolean timeIsCorrect(String time, String format) {

		// 需要验证的时间不能为空
		if(StringUtils.isEmpty(time)) {
			log.info("需要验证的时间为空");
			return false;
		}

		// 需要验证的时间格式不能为空
		if(StringUtils.isEmpty(format)) {
			log.info("需要验证的时间格式为空");
			return false;
		}

		// 开始验证
		return valid(format, time);
	}

	/**
	 * 正则验证
	 * @param regx  正则表达式
	 * @param data	数据
	 * @return
	 */
	private static boolean valid(String regx, String data) {

		Pattern pattern =  Pattern.compile(regx);
		Matcher matcher = pattern.matcher(data);

		if(matcher.matches()) {
			return true;
		}
		return false;
	}
}
