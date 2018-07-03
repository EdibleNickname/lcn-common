package com.can.util.validation;

import com.can.util.regex.RegexUtil;
import com.can.util.validation.exception.AssertException;
import org.apache.commons.lang3.StringUtils;

/**
 * @description: 参数声明工具类
 *
 * @author: LCN
 * @date: 2018-07-03 16:01
 */
public class AssertUtil {

	/**
	 * 字符串是否为空
	 *
	 * @param str 需要判断的字符为空或者null
	 * @param msg 为空是的提示信息
	 */
	public static void isEmpty(String str, String msg){
		if(StringUtils.isEmpty(str)) {
			throw new AssertException(msg == null ? "字符串为空" : msg);
		}
	}

	/**
	 * 判断对象是否为null
	 *
	 * @param obj 需要判断的对象
	 * @param msg 为null的提示信息
	 */
	public static void isNull(Object obj, String msg) {
		if(obj == null) {
			throw new AssertException(msg == null ? "对象不存在" : msg);
		}
	}

	/**
	 * 判断邮箱的格式是否正确
	 *
	 * @param eMail 需要判断的邮箱格式
	 * @param msg	错误的提示信息
	 */
	public static void isEmail(String eMail, String msg){

		String alertStr = "邮箱格式不正确";

		// 邮箱为空
		if(StringUtils.isEmpty(eMail)) {
			throw new AssertException("邮箱为空");
		}

		// 邮箱格式不正确
		if(!RegexUtil.isEmail(eMail)) {
			throw new AssertException(msg == null ? "邮箱格式不正确" : msg);
		}
	}


}
